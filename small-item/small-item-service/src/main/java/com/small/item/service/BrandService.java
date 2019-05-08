package com.small.item.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.small.common.PageResult;
import com.small.item.mapper.BrandMapper;
import com.small.item.pojo.TbBrand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class BrandService {

    @Autowired
    private BrandMapper brandMapper;

    public PageResult<TbBrand> queryBrandByPageAndSort(Integer page,Integer rows,String sortBy,Boolean desc,String key){
        //开始分页
        PageHelper.startPage(page,rows);
        // 过滤
        Example example = new Example(TbBrand.class);
        if (StringUtils.isNotBlank(key)) {
            example.createCriteria().andLike("name", "%" + key + "%")
                    .orEqualTo("letter", key);
        }
        if (StringUtils.isNotBlank(sortBy)) {
            // 排序
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        // 查询
        Page<TbBrand> pageInfo = (Page<TbBrand>) brandMapper.selectByExample(example);
        // 返回结果
        return new PageResult<>(pageInfo.getTotal(), pageInfo);
    }
}
