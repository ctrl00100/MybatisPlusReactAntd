package com.example.my.mybatispp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.my.mybatispp.entity.Tchild;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Admin
 * @since 2019-12-12
 */
public interface TchildService extends IService<Tchild> {

        void add(Tchild obj);
        void deleteById(int obj);
        void update(Tchild obj);
        IPage<Tchild> findAll(int current, int size);
        Tchild findById(int id);
        void deleteByList(List<Integer> obj);

        List<Tchild> findByParentId(int id);

        }



