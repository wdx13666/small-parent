package com.small.item.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.small.item.mapper.BrandMapper;
import com.small.item.pojo.TbBrand;
import com.small.item.pojo.TbCategoryBrand;
import com.small.item.service.BrandService;
import com.small.item.service.CategoryBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, TbBrand> implements BrandService {

    @Autowired
    private BrandService brandService;
    @Autowired
    private CategoryBrandService categoryBrandService;


    @Transactional
    @Override
    public void saveBrand(TbBrand brand, List<Long> cids) {
        // 新增品牌信息
        brandService.insert(brand);
        // 新增品牌和分类中间表
        TbCategoryBrand categoryBrand = new TbCategoryBrand();
        categoryBrand.setBrandId(brand.getId());
        for (Long cid : cids) {
            categoryBrand.setCategoryId(cid);
           categoryBrandService.insert(categoryBrand);
        }
    }

    @Transactional
    @Override
    public void delteBrand(Long id) {
        //删除品牌信息
        baseMapper.deleteById(id);
        //删除品牌和分类中间表信息
        categoryBrandService.delete(new EntityWrapper<TbCategoryBrand>().eq("brand_id",id));
    }

    @Transactional
    @Override
    public void editBrand(TbBrand brand, List<Long> cids) {
        //修改品牌信息
        baseMapper.updateById(brand);
        //删除中间表的信息  然后再添加
        TbCategoryBrand categoryBrand = new TbCategoryBrand();
        categoryBrand.setBrandId(brand.getId());
        categoryBrandService.delete(new EntityWrapper<TbCategoryBrand>().eq("brand_id",brand.getId()));
        for (Long cid : cids) {
            categoryBrand.setCategoryId(cid);
            categoryBrandService.insert(categoryBrand);
        }
    }
}
