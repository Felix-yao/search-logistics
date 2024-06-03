package com.felix.searchlogistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SearchLogisticsApplication {
//ss
    public static void main(String[] args) {
        SpringApplication.run(SearchLogisticsApplication.class, args);
    }
}
