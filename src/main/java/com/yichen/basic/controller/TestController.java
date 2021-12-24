package com.yichen.basic.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qiuxinchao
 * @version 1.0
 * @date 2021/12/24 10:20
 * @describe 测试 controller
 */
@RequestMapping("/test")
@RestController
public class TestController extends BaseController{

    @GetMapping("/get")
    @ApiOperation(value = "测试接口请求数据")
    public String get(@RequestParam("name") String name){
        logger.info("访问 /test/get,入参为 {}",name);
        return "get the data => "+name;
    }

}
