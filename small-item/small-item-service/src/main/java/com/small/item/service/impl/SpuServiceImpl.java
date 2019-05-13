package com.small.item.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.small.common.PageResult;
import com.small.item.mapper.BrandMapper;
import com.small.item.mapper.SpuMapper;
import com.small.item.pojo.TbBrand;
import com.small.item.pojo.TbCategory;
import com.small.item.pojo.TbSpu;
import com.small.item.service.CategoryService;
import com.small.item.service.SpuService;
import com.small.item.vo.SpuBo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpuServiceImpl extends ServiceImpl<SpuMapper, TbSpu> implements SpuService {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SpuService spuService;

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageResult<SpuBo> querySpuByPageAndSort(Integer page, Integer rows, Boolean saleable, String key) {
        Page<TbSpu> selectPage = spuService.selectPage(new Page<TbSpu>(page, rows), new EntityWrapper<TbSpu>().like("title", key).eq("saleable", saleable));

        List<SpuBo> spuBos = selectPage.getRecords().stream().map(spu -> {
            // 2、把spu变为 spuBo
            SpuBo spuBo = new SpuBo();
            // 属性拷贝
            BeanUtils.copyProperties(spu, spuBo);
            // 3、查询spu的商品分类名称,要查三级分类
            List<String> names = this.categoryService.selectBatchIds(
                    Arrays.asList(spu.getCid1(), spu.getCid2(), spu.getCid3())).stream().map(TbCategory::getName).collect(Collectors.toList());
            // 将分类名称拼接后存入
            spuBo.setCname(StringUtils.join(names, "/"));

            // 4、查询spu的品牌名称
            TbBrand brand = this.brandMapper.selectById(spu.getBrandId());
            spuBo.setBname(brand.getName());
            return spuBo;
        }).collect(Collectors.toList());
        return new PageResult<>(selectPage.getTotal(), spuBos);
    }
}
