package eCae.DreamLaptopBackEnd.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import eCae.DreamLaptopBackEnd.daoImpl.CategoryDaoImpl;
import eCae.DreamLaptopBackEnd.daoImpl.ProductDaoImpl;
import eCae.DreamLaptopBackEnd.daoImpl.SupplierDaoImpl;
import eCae.DreamLaptopBackEnd.daoImpl.UserDaoImpl;

@Configuration
@ComponentScan("eCae.DreamLaptopBackEnd")
public class hibernatConfig {
	@Autowired
	@Bean(name="dataSource")
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("eCae.DreamLaptopBackEnd");
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	@Autowired
	@Bean(name = "CategoryDaoImpl")
	public CategoryDaoImpl getCategoryDao(SessionFactory sf){
		return new CategoryDaoImpl(sf);
	}
	
	@Autowired
	@Bean(name = "SupplierDaoImpl")
	public SupplierDaoImpl getSupplierDao(SessionFactory sf){
		return new SupplierDaoImpl(sf);
	}
	
	@Autowired
	@Bean(name = "ProductDaoImpl")
	public ProductDaoImpl getProductDao(SessionFactory sf){
		return new ProductDaoImpl(sf);
	}
	@Autowired
	@Bean(name = "UserDaoImpl")
	public UserDaoImpl getUserDao(SessionFactory sf){
		return new UserDaoImpl(sf);
	}
}