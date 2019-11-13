package info.google.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

@Configuration
public class LocalContainerEntityManagerFactoryBeanUtil {
	@Autowired
	private DataSource dataSource;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setJpaVendorAdapter(new EclipseLinkJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("info.google.dao");
		entityManagerFactoryBean.setJpaProperties(properties());

		return entityManagerFactoryBean;
	}

	private Properties properties() {
		Properties properties = new Properties();
		properties.setProperty("eclipselink.weaving", "false");

		return properties;

	}

}
