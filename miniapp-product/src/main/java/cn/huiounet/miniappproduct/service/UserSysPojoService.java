package cn.huiounet.miniappproduct.service;


import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import cn.huiounet.miniappproduct.utils.AppException;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 10:03
 */
public interface UserSysPojoService {

    /**
     * 根据id查找
     * @param id
     * @return
     */
    UserSysPojo findById(int id)throws AppException;

    /**
     * 根据openId查找
     * @param open_id
     * @return
     */
    UserSysPojo findByOpenId(String open_id)throws AppException;
}
