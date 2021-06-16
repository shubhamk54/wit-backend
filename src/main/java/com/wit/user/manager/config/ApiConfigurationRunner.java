package com.wit.user.manager.config;

import com.wit.user.manager.util.ApiConfigUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApiConfigurationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        ApiConfigUtil.getInstance().fetchServiceEndpoints().entrySet()
                .forEach(endpoint -> System.setProperty(endpoint.getKey(), endpoint.getValue()));
    }
}