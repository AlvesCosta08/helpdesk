package com.helpdesk.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.helpdesk.helpdesk.services.DBService;


@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbService;

    @Bean
    public DBService intaciaDB(){
        this.dbService.instaciaDB();
        return dbService;  // Retorna o objeto dbService
    }
}
