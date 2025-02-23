package com.github.basler182.springhealthmonitorexample;

import com.github.basler182.springhealthmonitorstarter.EnableHealthMonitoring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableHealthMonitoring
@EnableDiscoveryClient
public class SpringHealthMonitorExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHealthMonitorExampleApplication.class, args);
    }

}
