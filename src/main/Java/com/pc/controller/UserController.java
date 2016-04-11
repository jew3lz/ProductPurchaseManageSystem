package com.pc.controller;

import com.pc.dao.UserDAO;
import com.pc.query.UserQuery;
import com.pc.result.MsgResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 吴振武 on 1/3/2016.
 */
@Controller
@RequestMapping("/proPur/user")
public class UserController {

    @Autowired
    private UserDAO userDAO;


    @RequestMapping("/queryUser")
    public ResponseEntity<Object> query30days(@RequestParam(required = false, value = "userName") String userName,
                                              @RequestParam(required = false, value = "userId") String userId,
                                              @RequestParam(required = false, value = "userPassword") String userPassword) {

        UserQuery query = new UserQuery();
        query.setUserId(userId);
        query.setUserName(userName);
        query.setUserPassword(userPassword);

        MsgResult<String> result = new MsgResult<String >();

        Integer count = userDAO.queryUser(query);
        if(count == 1){
            result.setValue("ok");
        }else{
            result.setValue("out");
        }
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

}
