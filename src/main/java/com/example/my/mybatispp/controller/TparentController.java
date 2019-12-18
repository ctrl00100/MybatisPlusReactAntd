
package com.example.my.mybatispp.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;
import com.example.my.mybatispp.entity.Tchild;
import com.example.my.mybatispp.entity.Tparent;
import com.example.my.mybatispp.service.TchildService;
import com.example.my.mybatispp.service.TparentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/manage/category")
    public class TparentController {
// 可在模版中添加相应的controller通用方法，编辑模版在resources/templates/controller.java.vm文件中

@Autowired
private TparentService iTparentService;



///list
@RequestMapping(path = "/list", method = RequestMethod.GET)
public RestResult findAlllist() {


    List<Tparent> mm = iTparentService.findAlllist();

//    System.out.println(mm.getRecords());
    System.out.println(mm);
    return new RestResult(true, StatusCode.OK, "findAlllist..ok", mm);
}

//add
@RequestMapping(path = "/add", method = RequestMethod.POST)
public RestResult add(@RequestBody Tparent obj) {
        iTparentService.add(obj);
        return new RestResult(true, StatusCode.OK, "add..ok");
        }

//findById r
@RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
public RestResult findById(@PathVariable("id") int id) {


    Tparent  mm = iTparentService.findById(id);


        return new RestResult(true, StatusCode.OK, "findById..ok", mm);
        }

//findAll r

@RequestMapping(path = "/findAll/{current}/{size}", method = RequestMethod.GET)
public RestResult findAll(@PathVariable("current") int current, @PathVariable("size") int size) {


        IPage<Tparent> mm = iTparentService.findAll(current, size);

        System.out.println(mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok", mm.getRecords());
        }

//update
@RequestMapping(path = "/update", method = RequestMethod.POST)
public RestResult update(@RequestBody Tparent obj) {
        iTparentService.update(obj);
        return new RestResult(true, StatusCode.OK, "update..ok");
        }

//delete
@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
public RestResult delete(@PathVariable("id") int id) {
        iTparentService.deleteById(id);
        return new RestResult(true, StatusCode.OK, "delete..ok");
        }

/**
 * 功能描述: 获取大分类
 */

//findByListName r
@RequestMapping(path = "/info", method = RequestMethod.GET)
public RestResult findByListName(@RequestParam(value="pcategoryId") int id) {


    Tparent  mm = iTparentService.findById(id);


    return new RestResult(true, StatusCode.OK, "findByListName..ok", mm);
}






        /**
         *
         * 功能描述: TchildController
         *
         * 子类控制
         *
         */


        @Autowired
        private TchildService iTchildService;
    //add  listchild
    @RequestMapping(path = "/listchild/add", method = RequestMethod.POST)
    public RestResult listchildadd(@RequestBody Tchild obj) {
        iTchildService.add(obj);
        return new RestResult(true, StatusCode.OK, "add listchild..ok");
    }

    //findById r  listchild
//    @RequestMapping(path = "/listchild/findByParentId/{id}", method = RequestMethod.GET)
//    public RestResult findByParentId(@PathVariable("id") int id) {
    @RequestMapping(path = "/listchild/findByParentId", method = RequestMethod.GET)
    public RestResult findByParentId(@RequestParam(value="parentId") int id) {
//        @RequestParam(value="username")String un

        List<Tchild>  mm = iTchildService.findByParentId(id);


        return new RestResult(true, StatusCode.OK, "findById listchild..ok", mm);
    }

    //update  listchild
    @RequestMapping(path = "/listchild/update", method = RequestMethod.POST)
    public RestResult listchildupdate(@RequestBody Tchild obj) {
        iTchildService.update(obj);
        return new RestResult(true, StatusCode.OK, "update listchild..ok");
    }




    //功能描述: 获取小分类


//findByListChildName r
    @RequestMapping(path = "/child/info", method = RequestMethod.GET)
    public RestResult findByListChildName(@RequestParam(value="categoryId") int id) {


        Tchild  mm = iTchildService.findById(id);


        return new RestResult(true, StatusCode.OK, "findByListChildName..ok", mm);
    }




        }

