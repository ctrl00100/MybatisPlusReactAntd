package com.example.my.mybatispp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.my.mybatispp.entity.Uuser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Admin
 * @since 2019-12-11
 */
public interface UuserService extends IService<Uuser> {

        void add(Uuser obj);
        void deleteById(String obj);
        void update(Uuser obj);
        IPage<Uuser> findAll(int current, int size);
        Uuser findById(int id);
        void deleteByList(List<Integer> obj);


        Uuser login(Uuser obj);
        public Uuser login2(Uuser obj);
}



