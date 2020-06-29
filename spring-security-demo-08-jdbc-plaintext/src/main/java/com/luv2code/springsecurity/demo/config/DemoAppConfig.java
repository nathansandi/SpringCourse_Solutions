package com.luv2code.springsecurity.demo.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="package com.luv2code.springsecurity.demo")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoAppConfig {
	//define bean for a view resolver
	
	//set up variable to hold the properties
	
	@Autowired
	private Environment env;
	
	
	//set up log
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	//define a bean for our security datasource
	@Bean
	public DataSource sercurityDataSource() {
		
		//create connection pool
		ComboPooledDataSource securityDatasource = 
				new ComboPooledDataSource();
		//set jdbc driver class
		try {
			securityDatasource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}
		
		//log the connection props~
		logger.info(">>>> jdbc.url -- "+env.getProperty("jdbc.url"));
		logger.info(">>>> jdbc.url -- "+env.getProperty("jdbc.user"));
		
		
		//det database connection props
		securityDatasource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDatasource.setUser(env.getProperty("jdbc.user"));
		securityDatasource.setPassword(env.getProperty("jdbc.password"));
			
		
		//set conection pool prop		
		logger.info(">>>> VAI INICIAR ");
		securityDatasource.setInitialPoolSize(
				getIntProperty("connection.pool.initialPoolSize"));
		
		securityDatasource.setMinPoolSize(
				getIntProperty("connection.pool.minPoolSize"));
		
		securityDatasource.setMaxPoolSize(
				getIntProperty("connection.pool.maxPoolSize"));
		
		securityDatasource.setMaxIdleTime(
				getIntProperty("connection.pool.maxIdleTime"));
		logger.info(">>>> TESTE ");
		return securityDatasource;
		
	}
	//need a helper method
	//read environment property and convert to int
	private int getIntProperty(String propName) {
		String propVal = env.getProperty(propName);
		
		//now coonvert to int
		
		int intPropVal = Integer.parseInt(propVal);
		return intPropVal;
	
	}
	
}
