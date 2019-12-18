package com.example.my.mybatispp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.my.mybatispp.mapper.MpUserMapper;
import com.example.my.mybatispp.entity.MpUser;
import com.example.my.mybatispp.service.MpUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisppApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private MpUserMapper  mpUserMapper;
    @Autowired
    private MpUserService service;
    @Test
    void contextLoads22() {

//        service.findAll();


//        MpUser obj = new MpUser();
////        obj.setId(5L);
//        obj.setUsername("bb");
//        obj.setOpenid("66");
//        int qq = service.insert(obj);
//        System.out.println(qq);

        /*System.out.println("返回数据："+employeeIPage.getRecords());

System.out.println("总条数："+page.getTotal());

System.out.println("当前页码："+page.getCurrent());

System.out.println("总页码："+page.getPages());

System.out.println("每页显示条数："+page.getSize());

System.out.println("是否有上一页："+page.hasPrevious());

System.out.println("是否有下一页："+page.hasNext());

System.out.println("返回的数据："+page.getRecords());*/


        Page<MpUser> page = new Page<>(1,5);
        IPage<MpUser> employeeList = mpUserMapper.selectPage(page,null);


        for (MpUser ee:employeeList.getRecords()
             ) {
            System.out.println(ee);
        }



    }

    @Test
    void contextLoads222() {
       List<Integer> idList = new ArrayList<>();
idList.add(22);
        mpUserMapper.deleteBatchIds(idList);
    }


    @Test
    void findAll() {
        Page<MpUser> page = new Page<>(2,2);
//        Page<MpUser> page = new Page<>(1,10);
        IPage<MpUser> employeeList = service.findAll(2,2);
        System.out.println(employeeList.getRecords());

    }




}
