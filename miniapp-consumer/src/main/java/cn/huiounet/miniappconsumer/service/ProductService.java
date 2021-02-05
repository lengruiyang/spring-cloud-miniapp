package cn.huiounet.miniappconsumer.service;


import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/4 23:44
 */
//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "miniapp-product-server",path ="/product" )
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface ProductService {
    @RequestMapping(value = "/productUser", produces = { "application/json;charset=UTF-8" })
    UserSysPojo getProductUser(@RequestParam("id") String id);

}
