package com.small.item.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.small.item.pojo.TbCategory;
import com.small.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据parentId查询类目
     * @param pid
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<List<TbCategory>> queryCategoryListByParentId(@RequestParam(value = "pid" , defaultValue = "0") Long pid){
        try {
            if (pid == null || pid.longValue() < 0){
                // pid为null或者小于等于0，响应400
                return ResponseEntity.badRequest().build();
            }
            List<TbCategory> tbCategories = categoryService.selectList(new EntityWrapper<TbCategory>().eq("parent_id",pid));
            if (CollectionUtils.isEmpty(tbCategories)){
                // 返回结果集为空，响应404
                return ResponseEntity.notFound().build();
            }
            // 响应200
            return ResponseEntity.ok(tbCategories);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 响应500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }


    /**
     * 通过品牌id查询商品分类
     * @param bid
     * @return
     */
    @GetMapping("bid/{bid}")
    public ResponseEntity<List<TbCategory>> queryByBrandId(@PathVariable("bid") Long bid){
        List<TbCategory> tbCategories = categoryService.queryByBrandId(bid);
        if (tbCategories == null || tbCategories.size() < 1) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(tbCategories);
    }
}
