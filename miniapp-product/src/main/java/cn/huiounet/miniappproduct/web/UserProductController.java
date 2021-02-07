package cn.huiounet.miniappproduct.web;

import cn.huiounet.miniapppojo.pojo.AppSysPojo;
import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import cn.huiounet.miniappproduct.service.UserSysPojoService;
import cn.huiounet.miniappproduct.utils.AppException;
import cn.huiounet.miniappproduct.utils.RequestReturn;
import cn.huiounet.miniappproduct.utils.http.HttpRequest;
import cn.huiounet.miniappproduct.utils.send_message.RamNumberUtil;
import cn.huiounet.miniappproduct.utils.send_message.SendMessageUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 12:24
 */
@RestController
public class UserProductController {
    @Autowired
    private UserSysPojoService userSysPojoService;
    @Autowired
    private RedisTemplate redisTemplate;



    @RequestMapping(value = "/productFindUserById",produces = { "application/json;charset=UTF-8" })
    public Map getProductUserById(String id){
        int i = Integer.parseInt(id);
        UserSysPojo byId = null;
        try {
            byId = userSysPojoService.findById(i);
        } catch (AppException e) {
            e.printStackTrace();
            return RequestReturn.getReturn(true,"未找到用户或未登录","002","");
        }
        System.out.println(byId.toString());
        return RequestReturn.getReturn(false,"","200",byId);
    }

    @RequestMapping(value = "/productFindUserByOpenId", produces = { "application/json;charset=UTF-8" })
    public Map getProductUserByOpenId(String open_id){
        UserSysPojo byId = null;
        try {
            byId = userSysPojoService.findByOpenId(open_id);
        } catch (AppException e) {
            e.printStackTrace();
            return RequestReturn.getReturn(true,"未找到用户或未登录","002","");
        }
        return RequestReturn.getReturn(false,"","200",byId);
    }

    @RequestMapping(value = "/GetOpenId", produces = { "application/json;charset=UTF-8" })
    public Map getOpenId(String code)throws Exception{
        AppSysPojo appSysPojo = new AppSysPojo();
        String jsonString = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", "appid=" + appSysPojo.getApp_id() + "&secret=" + appSysPojo.getApp_key() + "&js_code=" + code + "&grant_type=authorization_code");
        JSONObject json = JSONObject.fromObject(jsonString);
        String open_id = json.getString("openid");
        Map map = new HashMap();
        map.put("openId",open_id);
        map.put("code","200");
        return map;
    }

    @RequestMapping(value = "/sendMessage", produces = { "application/json;charset=UTF-8" })
    public Map sendMessage(String phone){
        String randomStr = RamNumberUtil.getRandomStr(6, 0);
        String mess = null;
        try {
            mess = SendMessageUtil.getMess(phone, randomStr, "5");
        } catch (Exception e) {
            return RequestReturn.getReturn(true,"验证码发送失败"+e.getMessage(),"004","");
        }
        redisTemplate.opsForValue().set(phone,randomStr);
        return RequestReturn.getReturn(false,"","200",mess);
    }
}
