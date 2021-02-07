package cn.huiounet.miniappproduct.service.impl;


import cn.huiounet.miniapppojo.pojo.UserSysPojo;
import cn.huiounet.miniappproduct.dao.UserSysDao;
import cn.huiounet.miniappproduct.service.UserSysPojoService;
import cn.huiounet.miniappproduct.utils.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 10:03
 */
@Service
public class UserSysPojoServiceImpl implements UserSysPojoService {
    @Autowired(required = false)
    private UserSysDao userSysDao;

    @Override
    public UserSysPojo findById(int id)throws AppException {
        if(userSysDao.findById(id) == null){
            throw new AppException("未找到用户");
        }
        return userSysDao.findById(id);
    }

    @Override
    public UserSysPojo findByOpenId(String open_id)throws AppException {
        if(userSysDao.findByOpenId(open_id) == null){
            throw new AppException("未找到用户");
        }
        return userSysDao.findByOpenId(open_id);
    }
}
