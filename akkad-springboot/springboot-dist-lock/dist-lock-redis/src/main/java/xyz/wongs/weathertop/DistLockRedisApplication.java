package xyz.wongs.weathertop;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan(basePackages = {"xyz.wongs.weathertop.**.mapper"})
@SpringBootApplication
public class DistLockRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistLockRedisApplication.class,args);
    }

    public void testDm(){

    }
}
