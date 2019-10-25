package com.usb.labchecker._config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.usb.labchecker.*")
@EnableJpaRepositories(basePackages = "com.usb.labchecker.*")
public class DataBaseConfig {
}
