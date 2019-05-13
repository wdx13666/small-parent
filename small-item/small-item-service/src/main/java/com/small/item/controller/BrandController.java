package com.small.item.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.small.common.PageResult;
import com.small.item.pojo.TbBrand;
import com.small.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /**
     * 根据parentId查询品牌
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    @GetMapping("/page")
    public ResponseEntity<PageResult<TbBrand>> queryCategoryListByParentId(   @RequestParam(value = "page", defaultValue = "1") Integer page,
                                                                              @RequestParam(value = "rows", defaultValue = "5") Integer rows,
                                                                              @RequestParam(value = "sortBy", required = false) String sortBy,
                                                                              @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
                                                                              @RequestParam(value = "key", required = false) String key) {
        Page<TbBrand> result = brandService.selectPage(new Page<TbBrand>(page,rows),new EntityWrapper<TbBrand>().like("letter",key).orderBy(sortBy,desc));
        if (result == null || result.getRecords().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(new PageResult<>(result.getTotal(),result.getRecords()));
    }

    /**
     * 新增品牌
     * @param brand
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> saveBrand(TbBrand brand, @RequestParam("cids") List<Long> cids) {
        brandService.saveBrand(brand, cids);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * 修改品牌
     * @param brand
     * @return
     */
    @PutMapping
    public ResponseEntity<Void> editBrand(TbBrand brand, @RequestParam("cids") List<Long> cids) {
        brandService.editBrand(brand, cids);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * 根据id删除品牌
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleBrand(@PathVariable("id") Long id){
        brandService.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
