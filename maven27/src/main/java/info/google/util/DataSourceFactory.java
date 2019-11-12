package info.google.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("db.properties")
public class DataSourceFactory {
	@Autowired
    private Environment environment;
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.username"));
		dataSource.setPassword(environment.getProperty("db.password"));
		
		return dataSource;
//	new DriverManagerDataSource().setUrl(environment.getProperty("db.url"));
//	new DriverManagerDataSource().setUsername(environment.getProperty("db.username"));
//	new DriverManagerDataSource().setPassword(environment.getProperty("db.password"));
//
//		
//		return new DriverManagerDataSource();

	}

}
