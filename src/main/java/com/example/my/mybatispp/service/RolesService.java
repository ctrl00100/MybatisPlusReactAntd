package com.example.my.mybatispp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.my.mybatispp.entity.Roles;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Admin
 * @since 2020-01-08
 */
public interface RolesService extends IService<Roles> {

        void add(Roles obj);
        void deleteById(int obj);
        void update(Roles obj);
        IPage<Roles> findAll(int current, int size);
        Roles findById(int id);
        void deleteByList(List<Integer> obj);



        }



