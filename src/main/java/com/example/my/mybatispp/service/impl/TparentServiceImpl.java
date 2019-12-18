package com.example.my.mybatispp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.mybatispp.entity.Tparent;
import com.example.my.mybatispp.mapper.TparentMapper;
import com.example.my.mybatispp.service.TparentService;
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
public class TparentServiceImpl extends ServiceImpl<TparentMapper, Tparent> implements TparentService {



        @Autowired
        private TparentMapper tparentMapper;

        //c  add
        @Override
        public void add(Tparent obj){

        tparentMapper.insert(obj);

        }


        //r findAll

        @Override
        public IPage<Tparent> findAll(int current, int size){
        Page<Tparent> page=new Page<>(current,size);
        IPage<Tparent>employeeList=tparentMapper.selectPage(page,null);
        return employeeList;
        }


        //r one

        @Override
        public Tparent findById(int id){
        Tparent employeeList=tparentMapper.selectById(id);
        return employeeList;
        }
        //u update
        @Override
        public void update(Tparent obj){

        tparentMapper.updateById(obj);

        }

        //d deleteById
        @Override
        public void deleteById(int obj){

        tparentMapper.deleteById(obj);

        }
        //d   deleteByList
        @Override
        public void deleteByList(List<Integer> obj){

        tparentMapper.deleteBatchIds(obj);

        }



        //findAlllist
        @Override
        public List<Tparent> findAlllist() {


                Map<String, Object> map = new HashMap<>();
                List<Tparent> mm= tparentMapper.selectByMap(map);

                return mm;
        }


}
