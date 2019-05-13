package com.small.item.controller;

import com.small.item.pojo.TbSpecification;
import com.small.item.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;


    @GetMapping("{id}")
    public ResponseEntity<String> querySpecificationByCategoryId (@PathVariable("id") Long id) {
        TbSpecification spec = specificationService.selectById(id);
        if (spec == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return  ResponseEntity.ok(spec.getSpecifications());
    }
}
