package com.example.my.mybatispp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.mybatispp.mapper.MpUserMapper;
import com.example.my.mybatispp.entity.MpUser;
import com.example.my.mybatispp.service.MpUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Admin
 * @since 2019-12-09
 */
@Service
public class MpUserServiceImpl extends ServiceImpl<MpUserMapper, MpUser> implements MpUserService {


    @Autowired
    private MpUserMapper mpUserMapper;


    //c
    @Override
    public void add(MpUser obj) {

        mpUserMapper.insert(obj);

    }

//r findAll

    @Override
    public IPage<MpUser> findAll(int current,int size) {
        Page<MpUser> page = new Page<>(current,size);
//        Page<MpUser> page = new Page<>(1,10);
        IPage<MpUser> employeeList = mpUserMapper.selectPage(page,null);
        return employeeList;
    }

    //r all

    @Override
    public MpUser findById(int id) {
        MpUser employeeList = mpUserMapper.selectById(id);
        return employeeList;
    }


    @Override
    public void deleteById(int obj) {

        mpUserMapper.deleteById(obj);

    }
//u
    @Override
    public void deleteByList(List<Integer> obj){

        mpUserMapper.deleteBatchIds(obj);

    }


    @Override
    public void update(MpUser obj) {

        mpUserMapper.updateById(obj);

    }


    @Override
    public IPage<MpUser> findAll2(int current,int size) {

//        mpUserMapper.selectMapsPage(obj);
   /*System.out.println("返回数据："+employeeIPage.getRecords());

System.out.println("总条数："+page.getTotal());

System.out.println("当前页码："+page.getCurrent());

System.out.println("总页码："+page.getPages());

System.out.println("每页显示条数："+page.getSize());

System.out.println("是否有上一页："+page.hasPrevious());

System.out.println("是否有下一页："+page.hasNext());

System.out.println("返回的数据："+page.getRecords());*/

        Page<MpUser> page = new Page<>(current,size);
//        Page<MpUser> page = new Page<>(1,1);
        IPage<MpUser> employeeList = mpUserMapper.selectPage(page,null);


        return employeeList;
    }


}
