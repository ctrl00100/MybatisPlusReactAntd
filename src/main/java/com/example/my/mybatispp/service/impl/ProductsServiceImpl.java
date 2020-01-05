package com.example.my.mybatispp.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.mybatispp.entity.Products;
import com.example.my.mybatispp.entity.Uuser;
import com.example.my.mybatispp.mapper.ProductsMapper;
import com.example.my.mybatispp.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Admin
 * @since 2019-12-16
 */
@Service
        public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products> implements ProductsService {



        @Autowired
        private ProductsMapper productsMapper;

        //c  add
        @Override
        public void add(Products obj){

        productsMapper.insert(obj);

        }


        //r findAll

        @Override
        public IPage<Products> findAll(int pageNum, int size){
        Page<Products> page=new Page<>(pageNum,size);
        IPage<Products>employeeList=productsMapper.selectPage(page,null);
        return employeeList;
        }


        //r one

        @Override
        public Products findById(int id){
        Products employeeList=productsMapper.selectById(id);
        return employeeList;
        }
        //u update
        @Override
        public void update(Products obj){

        productsMapper.updateById(obj);

        }

        //d deleteById
        @Override
        public void deleteById(int obj){

        productsMapper.deleteById(obj);

        }
        //d   deleteByList
        @Override
        public void deleteByList(List<Integer> obj){

        productsMapper.deleteBatchIds(obj);

        }


        //r findAllSearch

        @Override
        public IPage<Products> findAllSearch(int pageNum, int pageSize, String searchName, String searchType) {
                Page<Products> page=new Page<>(pageNum,pageSize);
                QueryWrapper<Products> wrapper = new QueryWrapper<>();
                if(searchType.equals("productName")){

                        wrapper.like("name",searchName);

                }else{
                        wrapper.like("ddesc",searchName);

                }

                IPage<Products>employeeList=productsMapper.selectPage(page,wrapper);
                return employeeList;

        }


}
