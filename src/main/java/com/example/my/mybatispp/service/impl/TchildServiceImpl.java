package com.example.my.mybatispp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.mybatispp.entity.Tchild;
import com.example.my.mybatispp.mapper.TchildMapper;
import com.example.my.mybatispp.service.TchildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Admin
 * @since 2019-12-12
 */
@Service
        public class TchildServiceImpl extends ServiceImpl<TchildMapper, Tchild> implements TchildService {



        @Autowired
        private TchildMapper tchildMapper;

        //c  add
        @Override
        public void add(Tchild obj){

        tchildMapper.insert(obj);

        }


        //r findAll

        @Override
        public IPage<Tchild> findAll(int current, int size){
        Page<Tchild> page=new Page<>(current,size);
        IPage<Tchild>employeeList=tchildMapper.selectPage(page,null);
        return employeeList;
        }


        //r one

        @Override
        public Tchild findById(int id){
        Tchild employeeList=tchildMapper.selectById(id);
        return employeeList;
        }
        //u update
        @Override
        public void update(Tchild obj){

        tchildMapper.updateById(obj);

        }

        //d deleteById
        @Override
        public void deleteById(int obj){

        tchildMapper.deleteById(obj);

        }
        //d   deleteByList
        @Override
        public void deleteByList(List<Integer> obj){

        tchildMapper.deleteBatchIds(obj);

        }

        @Override
        public List<Tchild> findByParentId(int id) {
                Map<String, Object> columnMap = new HashMap<>();
                columnMap.put("parentId",id );

                List<Tchild> mm=tchildMapper.selectByMap(columnMap);


                return mm;
        }


}
