package com.thevacay.core;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by uskay on 2/3/15.
 */
public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {

    public SessionInitializer(){
        super(HttpRedisSessionConfig.class);
    }

}
