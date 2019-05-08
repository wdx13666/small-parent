package com.small.item.service;

import com.small.item.mapper.CategoryMapper;
import com.small.item.pojo.TbCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据parentId查询子类目
     * @param pid
     * @return
     */
    public List<TbCategory> queryCategoryListByParentId(Long pid){
       TbCategory category = new TbCategory();
       category.setParentId(pid);
        return  this.categoryMapper.select(category);
    }

}
