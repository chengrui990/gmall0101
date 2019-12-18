package com.crui.gmall.user.controller;

import com.crui.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * VM Args:
 *
 * @author crui
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello, user";
    }
}
