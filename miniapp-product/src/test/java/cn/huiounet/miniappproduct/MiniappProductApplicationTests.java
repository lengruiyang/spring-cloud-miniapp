package cn.huiounet.miniappproduct;

import cn.huiounet.miniapppojo.pojo.AppSysPojo;
import cn.huiounet.miniappproduct.utils.AppException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class MiniappProductApplicationTests {

@Autowired
private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

    }

}
