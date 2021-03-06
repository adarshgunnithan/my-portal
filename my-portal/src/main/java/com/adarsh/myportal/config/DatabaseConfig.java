/*
 * (C) Copyright 
 * Author :Adarsh , created on 21-Dec-2017
 * DatabaseConfig.java ,
 *
 */

package com.adarsh.myportal.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.adarsh.myportal.constants.DatabaseConstants;


/**
 * @author Adarsh
 *Configuration class init DB connection from properties
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {
	
	@Autowired
	private Environment env;

	@Autowired
	private DataSource dataSource;

	@Autowired
	private LocalContainerEntityManagerFactoryBean entityManagerFactory;
	
	/**
	 * DataSource definition for database connection. Settings are read from the
	 * application.properties file (using the env object).
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty(DatabaseConstants.DRIVER));
		dataSource.setUrl(env.getProperty(DatabaseConstants.URL));
		dataSource.setUsername(env.getProperty(DatabaseConstants.USERNAME));
		dataSource.setPassword(env.getProperty(DatabaseConstants.PASSWORD));
		return dataSource;
	}

	/**
	 * Declare the JPA entity manager factory.
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactory.setDataSource(dataSource);

		// Classpath scanning of @Component, @Service, etc annotated class
		entityManagerFactory.setPackagesToScan(env.getProperty(DatabaseConstants.JPA_ENTITY_PACKAGE_PATTERN));

		// Vendor adapter
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		entityManagerFactory.setJpaVendorAdapter(vendorAdapter);

		// Hibernate properties
		Properties additionalProperties = new Properties();
		additionalProperties.put(DatabaseConstants.HIBERNATE_DIALECT, env.getProperty(DatabaseConstants.HIBERNATE_DIALECT));
		additionalProperties.put(DatabaseConstants.HIBERNATE_SHOW_SQL, env.getProperty(DatabaseConstants.HIBERNATE_SHOW_SQL));
		additionalProperties.put(DatabaseConstants.HIBERNATE_DDL, env.getProperty(DatabaseConstants.HIBERNATE_DDL));
		entityManagerFactory.setJpaProperties(additionalProperties);

		return entityManagerFactory;
	}

	/**
	 * Declare the transaction manager.
	 */
	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
		return transactionManager;
	}

	/**
	 * PersistenceExceptionTranslationPostProcessor is a bean post processor
	 * which adds an advisor to any bean annotated with Repository so that any
	 * platform-specific exceptions are caught and then rethrown as one Spring's
	 * unchecked data access exceptions (i.e. a subclass of
	 * DataAccessException).
	 */
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

}
