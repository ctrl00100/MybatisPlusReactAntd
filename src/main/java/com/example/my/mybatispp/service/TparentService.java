package com.example.my.mybatispp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.my.mybatispp.entity.Tparent;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Admin
 * @since 2019-12-12
 */
public interface TparentService extends IService<Tparent> {

        void add(Tparent obj);
        void deleteById(int obj);
        void update(Tparent obj);
        IPage<Tparent> findAll(int current, int size);
        Tparent findById(int id);
        void deleteByList(List<Integer> obj);

        List<Tparent> findAlllist();



        }



