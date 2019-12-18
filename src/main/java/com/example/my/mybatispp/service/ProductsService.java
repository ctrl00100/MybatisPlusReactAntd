package com.example.my.mybatispp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.my.mybatispp.entity.Products;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Admin
 * @since 2019-12-16
 */
public interface ProductsService extends IService<Products> {

        void add(Products obj);
        void deleteById(int obj);
        void update(Products obj);
        IPage<Products> findAll(int pageNum, int size);
        Products findById(int id);
        void deleteByList(List<Integer> obj);


    IPage<Products> findAllSearch(int pageNum, int pageSize, String searchName, String searchType);
}



