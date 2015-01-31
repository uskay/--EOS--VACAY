package com.thevacay.core;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.*;
import org.springframework.session.data.redis.config.annotation.web.http.*;

/**
 * Created by uskay on 1/30/15.
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * You need to build Redis environment in order to use this class
 */
@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }
}
