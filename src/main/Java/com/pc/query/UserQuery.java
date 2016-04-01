package com.pc.query;

/**
 * Created by 吴振武 on 1/4/2016.
 */
public class UserQuery {

    private String userName;

    private String userId;

    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public UserQuery setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserQuery setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public UserQuery setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
}
