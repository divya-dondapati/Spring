package info.google.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class LocalContainerEntityManagerFactoryBeanUtil {
	@Autowired
	private DataSource dataSource;
	@Bean

	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		
		entityManagerFactoryBean.setPersistenceUnitName("");
		return entityManagerFactoryBean;
	}

}
