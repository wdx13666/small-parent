package com.small.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.small.item.mapper.CategoryMapper;
import com.small.item.pojo.TbCategory;
import com.small.item.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, TbCategory> implements CategoryService {


    @Override
    public List<TbCategory> queryByBrandId(Long bid) {
        List<TbCategory> tbCategories = baseMapper.queryByBrandId(bid);
        return tbCategories;
    }
}
