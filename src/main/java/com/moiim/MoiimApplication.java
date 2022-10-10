package com.moiim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class MoiimApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoiimApplication.class, args);
    }
}
