package xyz.xuexiblog.moguboot;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "xyz.xuexiblog.moguboot.dao")
public class MogubootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MogubootApplication.class, args);
    }

}
