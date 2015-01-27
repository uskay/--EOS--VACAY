package com.thevacay.core;

import com.thevacay.service.session.RequestSessionBean;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by uskay on 1/24/15.
 */
@RequestMapping(value = "/api/v1")
@RestController
public class RestAPI {

    @RequestMapping(value = "/session/{resource}", method = { RequestMethod.GET, RequestMethod.POST }, produces = {MediaType.APPLICATION_JSON_VALUE})
    public IResponse session(@PathVariable String resource, @Valid @ModelAttribute RequestSessionBean bean, BindingResult bindingResult, HttpServletRequest rawRequest) {
        return new ServiceController().execute(Thread.currentThread().getStackTrace()[1].getMethodName(), resource, bean, bindingResult, rawRequest);
    }

}
