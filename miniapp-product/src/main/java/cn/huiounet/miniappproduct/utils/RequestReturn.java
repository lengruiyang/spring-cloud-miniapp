package cn.huiounet.miniappproduct.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/1/21 10:06
 */
public class RequestReturn {

    /**
     *
     * @param isError 是否异常
     * @param errorMsg 异常信息
     * @param code 状态码
     * @param data 对象信息
     * @return
     */
    public static Map getReturn(boolean isError,String errorMsg,String code,Object data){
        Map map = new HashMap();
        if(isError){
            map.put("code",code);
            map.put("message",errorMsg);
        }else {
            map.put("code","200");
            map.put("data",data);
        }
        return map;
    }
}
