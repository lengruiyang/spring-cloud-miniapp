package cn.huiounet.miniappconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/4 23:44
 */
//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "miniapp-product-server",path ="/product" )
@Component
public interface ProductService {
    @RequestMapping(value = "/productFindUserById", produces = { "application/json;charset=UTF-8" })
    Map getProductUser(@RequestParam("id") String id);

    @RequestMapping(value = "/productFindUserByOpenId", produces = { "application/json;charset=UTF-8" })
    Map getProductUserByOpenId(@RequestParam("open_id")String open_id);

    @RequestMapping(value = "/GetOpenId", produces = { "application/json;charset=UTF-8" })
    Map getOpenId(@RequestParam("code")String code);

    @RequestMapping(value = "/sendMessage", produces = { "application/json;charset=UTF-8" })
    Map sendMessage(@RequestParam("phone") String phone);

}
