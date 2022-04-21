package com.hiepnh.chatapp.coresvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CoreSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreSvcApplication.class, args);
    }

}
