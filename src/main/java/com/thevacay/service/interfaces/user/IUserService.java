package com.thevacay.service.interfaces.user;

/**
 * Created by uskay on 1/29/15.
 */
public interface IUserService {

    public UserResponseBean getCurrentSessionUserInfo();
    public UserResponseBean addUser(UserRequestBean request);
    public UserResponseBean updateUserInfo(UserRequestBean request);

}
