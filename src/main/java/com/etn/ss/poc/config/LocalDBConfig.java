/**
 * 
 */
package com.etn.ss.poc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * @author Saurav Singh
 *
 */
@Configuration
@Profile("local")
public class LocalDBConfig {

	@Bean

	DataSource localDataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScripts("sql/create_table.sql", "sql/insert_data.sql").build();
	}

}