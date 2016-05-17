package com.sudoku.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    @Primary
    public javax.sql.DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
