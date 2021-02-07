package cn.huiounet.miniappproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
//表示开启Fegin客户端
@EnableFeignClients
@MapperScan("cn.huiounet.miniappproduct.dao")
public class MiniappProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniappProductApplication.class, args);
    }

}
