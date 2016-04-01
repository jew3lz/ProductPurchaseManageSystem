package com.pc.dao;

import com.pc.query.UserQuery;

/**
 * Created by 吴振武 on 1/4/2016.
 */
public interface UserDAO {

    Integer queryUser(UserQuery query);

}
