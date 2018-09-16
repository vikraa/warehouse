package com.ruma.wrh;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.ruma.wrh.repository")
@ComponentScan({"com.ruma.wrh", "com.ruma.wrh.dao"})
public class WebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class);
    }

    @Bean
    public DataSource hikariCPConfig() {
        HikariConfig config = new HikariConfig("/hikari.properties");
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }
}