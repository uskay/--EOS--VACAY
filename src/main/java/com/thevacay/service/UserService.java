package com.thevacay.service;

import com.thevacay.service.interfaces.user.UserRequestBean;
import com.thevacay.service.interfaces.user.UserResponseBean;
import com.thevacay.service.interfaces.user.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by uskay on 1/29/15.
 */
@Service
public class UserService implements IUserService {


    @Override
    public UserResponseBean addUser(UserRequestBean request) {
        return null;
    }

}
