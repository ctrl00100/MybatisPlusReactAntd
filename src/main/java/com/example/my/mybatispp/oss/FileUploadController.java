package com.example.my.mybatispp.oss;

import cn.hutool.json.JSONObject;
import com.aliyun.oss.model.OSSObjectSummary;
import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2020/1/1 19:15
 * @Description:
 */

@CrossOrigin
@RestController
public class FileUploadController {
    @Autowired
    private FileUploadService fileUploadService;

    /**
     * @author lastwhisper
     * @desc 文件上传到oss
     * @return FileUploadResult
     * @Param uploadFile
     */
    @RequestMapping(value = "/file/upload",method = RequestMethod.POST )
    @ResponseBody
    public FileUploadResult upload(@RequestParam("file") MultipartFile uploadFile) throws Exception {
//    public RestResult upload(@RequestParam("file") MultipartFile[] uploadFile) throws Exception {
        return this.fileUploadService.upload(uploadFile);


//        return new RestResult(true, StatusCode.OK, "add..ok");


    }

    /**
     * @return FileUploadResult
     * @desc 根据文件名删除oss上的文件
     * http://localhost:8080/file/delete?fileName=images/2019/04/28/1556429167175766.jpg
     * @author lastwhisper
     * @Param objectName
     */
    @RequestMapping(value ="/file/delete", method = RequestMethod.POST)
    @ResponseBody
//    public FileUploadResult delete(@RequestParam("fileName") String objectName) throws Exception {
    public FileUploadResult delete(@RequestBody Map<String, String> map) throws Exception {
        String s = map.get("fileName").toString();// Map<String, String> map

//        String s = map.toString();
        System.out.println(s);
        System.out.println(this.fileUploadService.delete(s));
        return this.fileUploadService.delete(s);
    }

    /**
     * @author lastwhisper
     * @desc 查询oss上的所有文件
     * http://localhost:8080/file/list
     * @return List<OSSObjectSummary>
     * @Param
     */
    @RequestMapping("file/list")
    @ResponseBody
    public List<OSSObjectSummary> list()
            throws Exception {
        return this.fileUploadService.list();
    }

    /**
     * @author lastwhisper
     * @desc 根据文件名下载oss上的文件
     * @return
     * @Param objectName
     */
    @RequestMapping("file/download")
    @ResponseBody
    public void download(@RequestParam("fileName") String objectName, HttpServletResponse response) throws IOException {
        //通知浏览器以附件形式下载
        response.setHeader("Content-Disposition",
                "attachment;filename=" + new String(objectName.getBytes(), "ISO-8859-1"));
        this.fileUploadService.exportOssFile(response.getOutputStream(),objectName);
    }
}
