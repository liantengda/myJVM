package com.lian.Jvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyJVMApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJVMApplication.class, args);
    }

}
