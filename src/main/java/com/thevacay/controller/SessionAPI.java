package com.thevacay.controller;

import com.thevacay.model.requestparameters.session.SessionLogRequest;
import com.thevacay.model.requestparameters.session.SessionTokenRequest;
import com.thevacay.model.responseparameters.session.SessionLogResponse;
import com.thevacay.model.responseparameters.session.SessionTokenResponse;
import com.thevacay.service.interfaces.ISessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by uskay on 1/24/15.
 */
@Configuration
@ComponentScan("com.thevacay.service.session")
@RequestMapping(value = "/session")
@RestController
public class SessionAPI {

    @Autowired
    private ISessionService sessionService;

    @RequestMapping(value = "/token", method = { RequestMethod.GET }, produces = {MediaType.APPLICATION_JSON_VALUE})
    public SessionTokenResponse getToken(@Valid @ModelAttribute SessionTokenRequest bean, BindingResult bindingResult, HttpServletRequest rawRequest) {
        return sessionService.getToken(bean);
    }

    @RequestMapping(value = "/log", method = { RequestMethod.POST }, produces = {MediaType.APPLICATION_JSON_VALUE})
    public SessionLogResponse writeLog(@Valid @ModelAttribute SessionLogRequest bean, BindingResult bindingResult, HttpServletRequest rawRequest) {
        return sessionService.writeLog(bean);
    }

}
