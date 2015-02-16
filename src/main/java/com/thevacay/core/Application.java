package com.thevacay.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by uskay on 1/24/15.
 */
@Configuration
@ComponentScan("com.thevacay.api")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.thevacay.repository")
public class Application {

    public static void main(String[] args) {

        args = new String[7];
        args[0] = "--spring.datasource.url=jdbc:mysql://localhost/mydb";
        args[1] = "--spring.datasource.username=root";
        args[2] = "--spring.datasource.password=password";
        args[3] = "--spring.datasource.driverClassName=com.mysql.jdbc.Driver";
        args[4] = "--spring.jpa.hibernate.ddl-auto=validate";
        args[5] = "--spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect";
        args[6] = "--spring.jpa.properties.packagesToScan=com.thevacay.entity";

        SpringApplication.run(Application.class, args);

    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.thevacay.entity");
        factory.setDataSource(dataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory());
        return txManager;
    }

}


