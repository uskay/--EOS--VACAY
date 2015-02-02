package com.thevacay.api;

import com.thevacay.service.interfaces.user.UserRequestBean;
import com.thevacay.service.interfaces.user.UserResponseBean;
import com.thevacay.service.interfaces.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by uskay on 1/24/15.
 */
@Configuration
@ComponentScan("com.thevacay.service")
@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping(value = "/add", method = { RequestMethod.POST }, produces = {MediaType.APPLICATION_JSON_VALUE})
    public UserResponseBean getToken(@Valid @ModelAttribute UserRequestBean bean, BindingResult bindingResult, HttpServletRequest rawRequest) {
        return service.addUser(bean);
    }


}
