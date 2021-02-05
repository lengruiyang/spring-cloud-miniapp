package cn.huiounet.miniappeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniappEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniappEurekaApplication.class, args);
    }

}
