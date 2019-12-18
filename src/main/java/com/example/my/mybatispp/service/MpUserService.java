package com.example.my.mybatispp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.my.mybatispp.entity.MpUser;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Admin
 * @since 2019-12-09
 */
public interface MpUserService extends IService<MpUser> {



    void add(MpUser obj);
    void deleteById(int obj);
    void update(MpUser obj);
    IPage<MpUser> findAll(int current,int size);
    public MpUser findById(int id);
    public void deleteByList(List<Integer> obj);
    public IPage<MpUser> findAll2(int current,int size);
}
