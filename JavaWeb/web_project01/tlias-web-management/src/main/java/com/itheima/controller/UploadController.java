package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.util.AliyunOSSProperties;
import com.itheima.util.AliyunOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class UploadController {
/*    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile file) throws IOException {
        log.info("文件上传,username:{},age:{},file:{}",username,age,file);

        //将文件储存起来
        //获取原始文件名
        String originalFilename = file.getOriginalFilename();
        String extName = originalFilename.substring(originalFilename.lastIndexOf("."));

        //构建一个新的文件名
        String newFileName = UUID.randomUUID().toString()+extName;

        //文件存储
        file.transferTo(new File("D:/images/"+newFileName));

        return Result.success();*/
/*    @Value("${aliyun.oss.endpoint}")
    private String endpoint ;
    @Value("${aliyun.oss.bucketname}")
    String bucketName ;*/

    @Autowired
    private AliyunOSSProperties aliyunOSSProperties;
    /**
     * 阿里云OSS
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        log.info("文件上传,上传的文件名:{}",file.getOriginalFilename());
        String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String url =  AliyunOSSUtils.upload(aliyunOSSProperties.getEndpoint(), aliyunOSSProperties.getBucketname(),file.getBytes(),extName);
        return Result.success(url);
    }
}
