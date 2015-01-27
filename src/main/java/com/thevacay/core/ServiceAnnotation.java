package com.thevacay.core;

import com.thevacay.core.IRequest;
import com.thevacay.core.IResponse;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Created by uskay on 1/26/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ServiceAnnotation {
    String resource();
    String httpMethod();
}
