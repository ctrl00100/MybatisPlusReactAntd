
package com.example.my.mybatispp.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.my.mybatispp.config.MpPageResult;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;
import com.example.my.mybatispp.entity.Products;
import com.example.my.mybatispp.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Admin
 * @since 2019-12-16
 */
@CrossOrigin
@RestController
@RequestMapping("/manage/product")
    public class ProductsController {
// 可在模版中添加相应的controller通用方法，编辑模版在resources/templates/controller.java.vm文件中

@Autowired
private ProductsService productsService;
//add
@RequestMapping(path = "/add", method = RequestMethod.POST)
public RestResult add(@RequestBody Products obj) {
    productsService.add(obj);
        return new RestResult(true, StatusCode.OK, "add..ok");
        }

//findById r
@RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
public RestResult findById(@PathVariable("id") int id) {


    Products mm = productsService.findById(id);
        return new RestResult(true, StatusCode.OK, "findById..ok", mm);
        }

//findAllSearch  r

@RequestMapping(path = "/Searchlist", method = RequestMethod.GET)
public RestResult findAllSearch(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize,
                                @RequestParam("searchName") String searchName,@RequestParam("searchType") String searchType
) {


        IPage<Products> mm = productsService.findAllSearch(pageNum, pageSize,searchName,searchType);

        System.out.println(mm.getRecords());
    MpPageResult<Products> mm22 = new MpPageResult<Products>(mm.getTotal(),mm.getSize(),mm.getCurrent(),mm.getPages(),mm.getRecords());
    return new RestResult(true, StatusCode.OK, "findAllSearch..ok",mm22);
        }
//findAll r

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public RestResult findAll(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {


        IPage<Products> mm = productsService.findAll(pageNum, pageSize);

        System.out.println(mm.getRecords());
        MpPageResult<Products> mm22 = new MpPageResult<Products>(mm.getTotal(),mm.getSize(),mm.getCurrent(),mm.getPages(),mm.getRecords());
        return new RestResult(true, StatusCode.OK, "findAll..ok",mm22);
    }
//update
@RequestMapping(path = "/update", method = RequestMethod.POST)
public RestResult update(@RequestBody Products obj) {
    productsService.update(obj);
        return new RestResult(true, StatusCode.OK, "update..ok");
        }

//delete
@RequestMapping(path = "/delete/{id}", method = RequestMethod.POST)
public RestResult delete(@PathVariable("id") int id) {
    productsService.deleteById(id);
        return new RestResult(true, StatusCode.OK, "delete..ok");
        }



// 更新商品的状态(上架/下架)  productId, status

    @RequestMapping(path = "/updateStatus", method = RequestMethod.POST)
//    public RestResult updateStatus(@RequestBody Products obj) {
            public RestResult updateStatus(@RequestParam(value ="productId") int id, @RequestParam(value ="status") int status) {

        Products p = new Products();
        p.setId((long) id);
        p.setStatus(status);
        System.out.println(p);
        productsService.update(p);
        return new RestResult(true, StatusCode.OK, "updateStatus..ok");
//        return null;
    }

        }

