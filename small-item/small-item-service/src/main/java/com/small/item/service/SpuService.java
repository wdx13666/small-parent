package com.small.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.small.common.PageResult;
import com.small.item.pojo.TbSpu;
import com.small.item.vo.SpuBo;

public interface SpuService extends IService<TbSpu> {

    public PageResult<SpuBo> querySpuByPageAndSort(Integer page, Integer rows, Boolean saleable, String key);
}
