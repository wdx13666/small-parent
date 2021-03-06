package com.small.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.small.item.pojo.TbCategory;

import java.util.List;

public interface CategoryService extends IService<TbCategory> {
    List<TbCategory> queryByBrandId(Long bid);

}
