package com.pc.domain.dataobject;

/**
 * Created by 吴振武 on 1/4/2016.
 */
public class UserDO {

    private String userName;

    private String userId;

    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public UserDO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserDO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public UserDO setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
}
