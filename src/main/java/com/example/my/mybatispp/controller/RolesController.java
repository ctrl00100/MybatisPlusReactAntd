
package com.example.my.mybatispp.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;
import com.example.my.mybatispp.entity.Roles;
import com.example.my.mybatispp.service.RolesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Admin
 * @since 2020-01-08
 */
@CrossOrigin
@RestController
@RequestMapping("/manage/role")
    public class RolesController {
// 可在模版中添加相应的controller通用方法，编辑模版在resources/templates/controller.java.vm文件中

@Autowired
private RolesService rolesService;
//add
@RequestMapping(path = "/add", method = RequestMethod.POST)
//public RestResult add(@RequestBody Map<String,String> obj2) {
public RestResult add(@RequestBody Roles obj) {
//    System.out.println(obj2+"8989");
//    Roles obj = new Roles();
////    obj.setName(oo.get("roleName"));
//    obj.setName(obj2.get("roleName"));
    obj.setCreateTime(LocalDateTime.now());
    if(StringUtils.isEmpty(obj.getName())){
        return new RestResult(false, StatusCode.ERROR, "add..ERROR");
    }

    rolesService.add(obj);


        return new RestResult(true, StatusCode.OK, "add..ok");

        }

//findById r
@RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
public RestResult findById(@PathVariable("id") int id) {

    Roles  mm = rolesService.findById(id);

        return new RestResult(true, StatusCode.OK, "findById..ok", mm);
        }

//findAll r

@RequestMapping(path = "/findAll/{current}/{size}", method = RequestMethod.GET)
public RestResult findAll(@PathVariable("current") int current, @PathVariable("size") int size) {


        IPage<Roles> mm = rolesService.findAll(current, size);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok", mm.getRecords());
        }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public RestResult findAll2() {
        int current=1;
        int size=1000;

        IPage<Roles> mm = rolesService.findAll(current, size);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll-list..ok", mm.getRecords());
    }
//update
@RequestMapping(path = "/update", method = RequestMethod.POST)
public RestResult update(@RequestBody Roles obj) {
    obj.setAuthTime(LocalDateTime.now());
    rolesService.update(obj);
        return new RestResult(true, StatusCode.OK, "update..ok");
        }

//delete
@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
public RestResult delete(@PathVariable("id") int id) {
    rolesService.deleteById(id);
        return new RestResult(true, StatusCode.OK, "delete..ok");
        }



        }

