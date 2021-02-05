package cn.huiounet.miniappproduct.dao;


import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import tk.mybatis.mapper.common.Mapper;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 09:51
 */
public interface UserSysDao extends Mapper<UserSysPojo> {

    /**
     * 根据id查找
     * @param id
     * @return
     */
    UserSysPojo findById(int id);

    /**
     * 根据openId查找
     * @param open_id
     * @return
     */
    UserSysPojo findByOpenId(String open_id);

}
