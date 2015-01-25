package com.thevacay.core;

import com.thevacay.core.IRequest;
import com.thevacay.core.IResponse;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Created by uskay on 1/26/15.
 */
@Target(ElementType.METHOD)
public @interface ServiceAPI {
    String path();
    String httpMethod();
}
