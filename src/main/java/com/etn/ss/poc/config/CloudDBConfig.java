package com.etn.ss.poc.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class CloudDBConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}