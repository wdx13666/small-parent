package com.small.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.small.item.mapper.CategoryBrandMapper;
import com.small.item.pojo.TbCategoryBrand;
import com.small.item.service.CategoryBrandService;
import org.springframework.stereotype.Service;

@Service
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandMapper, TbCategoryBrand> implements CategoryBrandService {

}
