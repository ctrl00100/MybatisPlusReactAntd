package com.example.my.mybatispp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.mybatispp.entity.Roles;
import com.example.my.mybatispp.mapper.RolesMapper;
import com.example.my.mybatispp.service.RolesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Admin
 * @since 2020-01-08
 */
@Service
        public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements RolesService {



        @Autowired
        private RolesMapper rolesMapper;

        //c  add
        @Override
        public void add(Roles obj){

        rolesMapper.insert(obj);

        }


        //r findAll

        @Override
        public IPage<Roles>findAll(int current,int size){
        Page<Roles> page=new Page<>(current,size);
        IPage<Roles> employeeList=rolesMapper.selectPage(page,null);
        return employeeList;
        }


        //r one

        @Override
        public Roles findById(int id){
        Roles employeeList=rolesMapper.selectById(id);
        return employeeList;
        }
        //u update
        @Override
        public void update(Roles obj){

        rolesMapper.updateById(obj);

        }

        //d deleteById
        @Override
        public void deleteById(int obj){

        rolesMapper.deleteById(obj);

        }
        //d   deleteByList
        @Override
        public void deleteByList(List<Integer> obj){

        rolesMapper.deleteBatchIds(obj);

        }








        }
