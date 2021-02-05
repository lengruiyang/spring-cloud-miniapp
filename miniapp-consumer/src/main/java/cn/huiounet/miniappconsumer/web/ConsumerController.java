package cn.huiounet.miniappconsumer.web;


import cn.huiounet.miniappconsumer.service.ProductService;
import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/4 23:45
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;

    @RequestMapping( value = "/getConsumer",produces = { "application/json;charset=UTF-8" })
    public UserSysPojo getConsumer(String id){

        UserSysPojo productUser = productService.getProductUser(id);

        return productUser;
    }
}

