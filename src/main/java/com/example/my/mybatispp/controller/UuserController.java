
package com.example.my.mybatispp.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;
import com.example.my.mybatispp.entity.Uuser;
import com.example.my.mybatispp.service.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Admin
 * @since 2019-12-11
 */
@RestController
@CrossOrigin
@RequestMapping("/uuser")
    public class UuserController {
// 可在模版中添加相应的controller通用方法，编辑模版在resources/templates/controller.java.vm文件中

@Autowired
private UuserService iUuserService;

//login2

    @RequestMapping(path = "/login2", method = RequestMethod.POST)
    public RestResult login2(@RequestBody Uuser obj) {
        Uuser uuser=iUuserService.login2(obj);
        System.out.println(uuser);
        return new RestResult(true, StatusCode.OK, "login2..ok",uuser);
    }


//login

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public RestResult login(@RequestBody Uuser obj) {
        Uuser uuser=iUuserService.login(obj);
        System.out.println(uuser);
        return new RestResult(true, StatusCode.OK, "login..ok",uuser);
    }

//add
@RequestMapping(path = "/add", method = RequestMethod.POST)
public RestResult add(@RequestBody Uuser obj) {
        iUuserService.add(obj);
        return new RestResult(true, StatusCode.OK, "add..ok");
        }

    //add
    @RequestMapping(path = "/user/add", method = RequestMethod.POST)
    public RestResult add2(@RequestBody Uuser obj) {
        iUuserService.add(obj);
        return new RestResult(true, StatusCode.OK, "add..ok");
    }

//findById r
@RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
public RestResult findById(@PathVariable("id") int id) {


    Uuser  mm = iUuserService.findById(id);


        return new RestResult(true, StatusCode.OK, "findById..ok", mm);
        }

//findAll r

@RequestMapping(path = "/findAll/{current}/{size}", method = RequestMethod.GET)
public RestResult findAll(@PathVariable("current") int current, @PathVariable("size") int size) {


        IPage<Uuser> mm = iUuserService.findAll(current, size);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok", mm.getRecords());
        }

    @RequestMapping(path = "/user/list", method = RequestMethod.GET)
    public RestResult findAll2() {


        IPage<Uuser> mm = iUuserService.findAll(1, 11111);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok", mm.getRecords());
    }

//update
@RequestMapping(path = "/user/update", method = RequestMethod.POST)
public RestResult update(@RequestBody Uuser obj) {
        iUuserService.update(obj);
        return new RestResult(true, StatusCode.OK, "update..ok");
        }

//delete
@RequestMapping(path = "/user/delete", method = RequestMethod.POST)
public RestResult delete(@RequestBody Uuser  uuser) {
    System.out.println(uuser);
    String aa= (uuser.getId()).toString();

        iUuserService.deleteById(aa);
        return new RestResult(true, StatusCode.OK, "delete..ok");
        }



        }

