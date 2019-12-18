package com.example.my.mybatispp.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.mybatispp.entity.Uuser;
import com.example.my.mybatispp.mapper.UuserMapper;
import com.example.my.mybatispp.service.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Admin
 * @since 2019-12-11
 */
@Service
public class UuserServiceImpl extends ServiceImpl<UuserMapper, Uuser> implements UuserService {


    @Autowired
    private UuserMapper iUuserMapper;


    //c  add
    @Override
    public void add(Uuser obj) {

        iUuserMapper.insert(obj);

    }


    //r findAll

    @Override
    public IPage<Uuser> findAll(int current, int size) {
        Page<Uuser> page = new Page<>(current, size);
        IPage<Uuser> employeeList = iUuserMapper.selectPage(page, null);
        return employeeList;
    }


    //r one

    @Override
    public Uuser findById(int id) {
        Uuser employeeList = iUuserMapper.selectById(id);
        return employeeList;
    }

    //u update
    @Override
    public void update(Uuser obj) {

        iUuserMapper.updateById(obj);

    }

    //d deleteById
    @Override
    public void deleteById(int obj) {

        iUuserMapper.deleteById(obj);

    }

    //d   deleteByList
    @Override
    public void deleteByList(List<Integer> obj) {

        iUuserMapper.deleteBatchIds(obj);

    }

    //login
    @Override
    public Uuser login(Uuser obj) {
        QueryWrapper<Uuser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", obj.getUsername());
//                        .or()
//                        .gt("age", 20);


                /*
                *
        Map<String,Object> condition = new HashMap<>();
       condition.put("name","周新");
       condition.put("age",20);*/
        Uuser u2 = new Uuser();

        u2 = iUuserMapper.selectOne(wrapper);

        obj.getPassword().equals(u2.getPassword());

        return u2;
    }
        @Override
        public Uuser login2(Uuser obj) {

                Uuser u2 = iUuserMapper.selectByUsernamezj(obj.getUsername());
                return u2;
        }

}
