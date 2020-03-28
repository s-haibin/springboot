package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController

@SpringBootApplication(scanBasePackages = "com.example.springboot")
public class SpringbootApplication {

//    @RequestMapping("hello")
//    String home(){
//        return "Hello,World!";
//    }

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootApplication.class, args);
        SpringApplication.run(SpringbootApplication.class,args);
    }

}
