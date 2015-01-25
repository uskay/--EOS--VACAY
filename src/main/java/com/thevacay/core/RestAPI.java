package com.thevacay.core;

import com.thevacay.service.session.SessionBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by uskay on 1/24/15.
 */
public class RestAPI {

    @RequestMapping(value = "/session/{resource}", method = { RequestMethod.GET, RequestMethod.POST }, produces = {MediaType.APPLICATION_JSON_VALUE})
    public IResponse session(@PathVariable String resource, @ModelAttribute SessionBean bean, HttpServletRequest rawRequest) {

        String httpMethod = rawRequest.getMethod();

        return null;
    }



}
