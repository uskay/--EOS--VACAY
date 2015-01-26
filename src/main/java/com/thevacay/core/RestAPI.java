package com.thevacay.core;

import com.thevacay.service.session.SessionBean;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by uskay on 1/24/15.
 */
@RequestMapping(value = "/api/v1", method = { RequestMethod.GET, RequestMethod.POST }, produces = {MediaType.APPLICATION_JSON_VALUE})
public class RestAPI {

    @RequestMapping("/session/{resource}")
    public IResponse session(@PathVariable String resource, @Valid @ModelAttribute SessionBean bean, BindingResult bindingResult, HttpServletRequest rawRequest) {
        return new ServiceController().execute(Thread.currentThread().getStackTrace()[1].getMethodName(), resource, bean, bindingResult, rawRequest);
    }

}
