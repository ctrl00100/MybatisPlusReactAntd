
package com.example.my.mybatispp.controller;


import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.my.mybatispp.entity.MpUser;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;

import com.example.my.mybatispp.service.MpUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Admin
 * @since 2019-12-09
 */
@RestController
@CrossOrigin
@RequestMapping("/l/user")
public class MpUserController {

    @Autowired
    private MpUserService service;
//	@RequestMapping(path = "/findAll2", method = RequestMethod.POST)

    //add c
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public RestResult add(@RequestBody MpUser obj) {

        if (StringUtils.isEmpty(obj.getUsername())) {
            return new RestResult(true, StatusCode.ERROR, "用户名为空");
        }
        service.add(obj);


        return new RestResult(true, StatusCode.OK, "add..ok");
    }


//findAll r

    @RequestMapping(path = "/findAll/{current}/{size}", method = RequestMethod.GET)
    public RestResult findAll(@PathVariable("current") int current, @PathVariable("size") int size) {


        IPage<MpUser> mm = service.findAll(current, size);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok", mm.getRecords());
    }

    //findById r
    @RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
    public RestResult findById(@PathVariable("id") int id) {


        MpUser mm = service.findById(id);

//        System.out.println(mm);
//        return mm;
        return new RestResult(true, StatusCode.OK, "findById..ok", mm);
    }


    //uu
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public RestResult update(@RequestBody MpUser obj) {
        service.update(obj);
        return new RestResult(true, StatusCode.OK, "update..ok");
    }

    //dd
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
    public RestResult delete(@PathVariable("id") int id) {
        service.deleteById(id);
        return new RestResult(true, StatusCode.OK, "delete..ok");
    }


}

