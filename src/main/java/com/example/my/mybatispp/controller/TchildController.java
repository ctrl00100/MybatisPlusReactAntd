
package com.example.my.mybatispp.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;
import com.example.my.mybatispp.entity.Tchild;
import com.example.my.mybatispp.service.TchildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Admin
 * @since 2019-12-12
 */
@CrossOrigin
@RestController
@RequestMapping("/a/tchild")
    public class TchildController {
// 可在模版中添加相应的controller通用方法，编辑模版在resources/templates/controller.java.vm文件中

@Autowired
private TchildService iTchildService;
//add
@RequestMapping(path = "/add", method = RequestMethod.POST)
public RestResult add(@RequestBody Tchild obj) {
        iTchildService.add(obj);
        return new RestResult(true, StatusCode.OK, "add..ok");
        }

//findById r
@RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
public RestResult findById(@PathVariable("id") int id) {


    Tchild  mm = iTchildService.findById(id);


        return new RestResult(true, StatusCode.OK, "findById..ok", mm);
        }

//findAll r

@RequestMapping(path = "/findAll/{current}/{size}", method = RequestMethod.GET)
public RestResult findAll(@PathVariable("current") int current, @PathVariable("size") int size) {


        IPage<Tchild> mm = iTchildService.findAll(current, size);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok", mm.getRecords());
        }

//update
@RequestMapping(path = "/update", method = RequestMethod.POST)
public RestResult update(@RequestBody Tchild obj) {
        iTchildService.update(obj);
        return new RestResult(true, StatusCode.OK, "update..ok");
        }

//delete
@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
public RestResult delete(@PathVariable("id") int id) {
        iTchildService.deleteById(id);
        return new RestResult(true, StatusCode.OK, "delete..ok");
        }



        }

