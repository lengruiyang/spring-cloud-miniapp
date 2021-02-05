package cn.huiounet.miniappproduct.web;

import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import cn.huiounet.miniappproduct.service.UserSysPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 12:24
 */
@RestController
public class UserProductController {
    @Autowired
    private UserSysPojoService userSysPojoService;


    @RequestMapping(value = "/productUser", produces = { "application/json;charset=UTF-8" })
    public UserSysPojo getProductUser(String id){
        UserSysPojo byId = userSysPojoService.findById(Integer.parseInt(id));
        return byId;
    }
}
