package com.small.item.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.small.item.pojo.TbCategory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper extends BaseMapper<TbCategory> {

    /**
     * 根据品牌id查询商品分类
     * @param bid
     * @return
     */
    @Select("SELECT * FROM tb_category WHERE id IN (SELECT category_id FROM tb_category_brand WHERE brand_id = #{bid})")
    List<TbCategory> queryByBrandId(Long bid);
}
