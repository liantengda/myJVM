package com.lian.Jvm.controller;

import com.lian.Jvm.common.globalexception.pojo.response.R;
import com.lian.Jvm.model.User;
import com.lian.Jvm.service.MyHttpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;


/**
 * @author Ted
 * @date 2020/6/12 14:18
 */
@RestController
@RequestMapping(value = "/myHttp")
@Slf4j
@Api(tags = "myHttp测试接口")
public class MyHttpController {

    @Autowired
    MyHttpService myHttpService;

    @RequestMapping(value = "/requestWithoutRequestParam",method = RequestMethod.GET)
    @ApiOperation("远程调用不带参数的get接口")
    public void   requestWithoutParamByMyHttpClient(String baseUrl, HttpServletResponse response)  {
       myHttpService.doGetWithoutParam(baseUrl,response);
    }

    @RequestMapping(value = "/requestWithUrlParam",method = RequestMethod.GET)
    @ApiOperation("远程调用带有url参数的get接口")
    public void   requestWithUrlParamsByMyHttpClient(String baseUrl, HttpServletResponse response)  {
        myHttpService.doGetWithParam(baseUrl,response);
    }

    @RequestMapping(value = "requestPost",method = RequestMethod.GET)
    @ApiOperation("远程调用post示例接口")
    public void requestPost(String baseUrl,HttpServletResponse response) {
       myHttpService.doPostWithoutUrlParam(baseUrl,response);
    }

    @RequestMapping(value = "requestPostUrl",method = RequestMethod.GET)
    @ApiOperation("远程调用带有url参数的Post接口")
    public void requestPostWithUrlParam(String baseUrl,HttpServletResponse response)  {
        myHttpService.doPostWithUrlParam(baseUrl,response);
    }


    @RequestMapping(value = "calledTestPostWithUrl",method = RequestMethod.POST)
    @ApiOperation("post请求远程示例带有url参数")
    public R<JSONObject> calledTestPostWithUrl(@RequestBody User user,String urlParam){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user",user);
        jsonObject.put("urlParm",urlParam);
        return new R<>(jsonObject);
    }

    @RequestMapping(value = "calledTestPost",method = RequestMethod.POST)
    @ApiOperation("post请求远程示例")
    public R<User> calledTestPost(@RequestBody User user){
        return new R<>(user);
    }


    @RequestMapping(value = "/calledNotRequestParam",method = RequestMethod.GET)
    @ApiOperation("不带有请求参数的Get远程示例")
    public R<String> calledTestNotRequestParam(){
        System.out.println("hehehe");
        return new R<>("调用成功了");
    }

    @RequestMapping(value = "/calledWithUrlParam",method = RequestMethod.GET)
    @ApiOperation("带有url参数的get请求示例")
    public R<JSONObject> calledTestWithUrlParam(String name,Integer age){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        jsonObject.put("age",age);
        return new R<>(jsonObject);
    }


    @RequestMapping(value = "/hehe",method = RequestMethod.GET)
    public R<com.alibaba.fastjson.JSONObject> calledTestWithMapJson(){
        HashMap<String, String> map = new HashMap<>();
        map.put("android_goods_activity","kkkkkkkk");
        map.put("android_push_key","kkkkkk");
        com.alibaba.fastjson.JSONObject jsonObject = new com.alibaba.fastjson.JSONObject();
        jsonObject.put("beginTime",null);
        jsonObject.put("cfgGroup","PUSH");
        jsonObject.put("cfgValue", map.toString());
        return new R<>(jsonObject);
    }

}
