package com.small.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.small.item.pojo.TbBrand;

import java.util.List;

public interface BrandService extends IService<TbBrand> {

    public void saveBrand(TbBrand brand, List<Long> cids) ;

    public void delteBrand(Long id) ;

    public void editBrand(TbBrand brand, List<Long> cids);
}
