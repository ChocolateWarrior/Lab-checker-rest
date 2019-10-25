package com.usb.labchecker._config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.usb.labchecker.*")
public class LabCheckerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabCheckerApplication.class, args);
    }

}
