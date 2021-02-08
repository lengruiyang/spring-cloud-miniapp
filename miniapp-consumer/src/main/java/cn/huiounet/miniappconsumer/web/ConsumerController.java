package cn.huiounet.miniappconsumer.web;


import cn.huiounet.miniappconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/4 23:45
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;

    @RequestMapping( value = "/getConsumerGetUserById",produces = { "application/json;charset=UTF-8" })
    public Map getConsumerById(String id){

        Map productUser = productService.getProductUser(id);

        return productUser;
    }

    @RequestMapping(value = "/productFindUserByOpenId", produces = { "application/json;charset=UTF-8" })
    public Map getConsumerByOpenId(String open_id){
        Map productUserByOpenId = productService.getProductUserByOpenId(open_id);

        return productUserByOpenId;
    }

    @RequestMapping(value = "/GetOpenId", produces = { "application/json;charset=UTF-8" })
    public Map getOpenId(@RequestParam("code")String code){
        Map openId = productService.getOpenId(code);

        return openId;
    }

    @RequestMapping(value = "/sendMessage", produces = { "application/json;charset=UTF-8" })
    public Map sendMessage(@RequestParam("phone")String phone){
        Map map = productService.sendMessage(phone);

        return map;
    }
}

