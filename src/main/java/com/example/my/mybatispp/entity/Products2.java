package com.example.my.mybatispp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Admin
 * @since 2019-12-16
 */
@Data
public class Products2  {




    private Long id;

    private String[]  imgs;

    private Integer status;

    private String name;

    private String ddesc;

    private Long price;


    private String pCategoryId;


    private String categoryId;

    private String detail;

    private Integer v;


    public Products2(Products products) {
        this.id = products.getId();

        this.status = products.getStatus();
        this.name = products.getName();
        this.ddesc = products.getDdesc();
        this.price = products.getPrice();
        this.pCategoryId = products.getPCategoryId();
        this.categoryId = products.getCategoryId();
        this.detail = products.getDetail();
        this.v = products.getV();


//        String[] imgs2 = new String[];

        String imgspp = products.getImgs();

        this.imgs  =  imgspp.split("--");

    }



}
