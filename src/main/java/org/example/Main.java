package org.example;

import org.example.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author zhangsheng
 * Time 2023/11/3 10:32
 */
@SpringBootApplication
@Import(JpaConfig.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}