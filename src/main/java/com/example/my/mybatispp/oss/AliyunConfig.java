package com.example.my.mybatispp.oss;

/**
 * @Auther: Administrator
 * @Date: 2020/1/1 16:31
 * @Description:
 */


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class AliyunConfig {
//    @Value("${aliyun.oss.endpoint}")
//    private String ALIYUN_OSS_ENDPOINT;
//    @Value("${aliyun.oss.accessKeyId}")
//    private String ALIYUN_OSS_ACCESSKEYID;
//    @Value("${aliyun.oss.accessKeySecret}")
//    private String ALIYUN_OSS_ACCESSKEYSECRET;
//    @Bean
//    public OSSClient ossClient(){
//        return new OSSClient(ALIYUN_OSS_ENDPOINT,ALIYUN_OSS_ACCESSKEYID,ALIYUN_OSS_ACCESSKEYSECRET);
//    }
    @Value("${aliyun.oss.endpoint}")
    private String endpoint;
    @Value("${aliyun.oss.accessKeyId}")
    private String accessKeyId;
    @Value("${aliyun.oss.accessKeySecret}")
    private String accessKeySecret;
    @Value("${aliyun.oss.bucketName}")
    private String bucketName;
    @Value("${aliyun.oss.urlPrefix}")
    private String urlPrefix;

    @Bean
    public OSS oSSClient() {
        return new OSSClient(endpoint, accessKeyId, accessKeySecret);
    }

}

