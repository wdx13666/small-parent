package com.small.item.vo;

import com.small.item.pojo.TbSpu;

public class SpuBo extends TbSpu {
    String cname;// 商品分类名称
    String bname;// 品牌名称

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
