package com.thevacay.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.orm.hibernate3.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by uskay on 1/24/15.
 */
@Configuration
@ComponentScan("com.thevacay.api")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.thevacay.repository")
public class Application {

    public static void main(String[] args) {

//        args = new String[7];
//        args[0] = "--spring.datasource.url=jdbc:mysql://localhost/mydb";
//        args[1] = "--spring.datasource.username=root";
//        args[2] = "--spring.datasource.password=password";
//        args[3] = "--spring.datasource.driverClassName=com.mysql.jdbc.Driver";
//        args[4] = "--spring.jpa.hibernate.ddl-auto=validate";
//        args[5] = "--spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect";
//        args[6] = "--spring.jpa.properties.packagesToScan=com.thevacay.entity";

        SpringApplication.run(Application.class, args);

    }


//    @Autowired
//    private Environment env;
//
//    @Value("${init-db:false}")
//    private String initDatabase;

//    @Bean
//    public PlatformTransactionManager transactionManager()
//    {
//        EntityManagerFactory factory = entityManagerFactory().getObject();
//        return new JpaTransactionManager(factory);
//    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
//    {
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(Boolean.TRUE);
//        vendorAdapter.setShowSql(Boolean.TRUE);
//
//        factory.setDataSource(dataSource());
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan("com.thevacay.entity");
//
//        Properties jpaProperties = new Properties();
//        jpaProperties.put("hibernate.hbm2ddl.auto", "none");
//        factory.setJpaProperties(jpaProperties);

//        factory.afterPropertiesSet();
//        factory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
//        return factory;
//    }

    @Bean
    public HibernateExceptionTranslator hibernateExceptionTranslator()
    {
        return new HibernateExceptionTranslator();
    }

//    @Bean
//    public DataSource dataSource()
//    {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost/mydb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("password");
//        return dataSource;
//    }

//    @Bean
//    public DataSourceInitializer dataSourceInitializer(DataSource dataSource)
//    {
//        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//        dataSourceInitializer.setDataSource(dataSource);
//        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//        databasePopulator.addScript(new ClassPathResource("db.sql"));
//        dataSourceInitializer.setDatabasePopulator(databasePopulator);
//        dataSourceInitializer.setEnabled(Boolean.parseBoolean(initDatabase));
//        return dataSourceInitializer;
//    }

}


