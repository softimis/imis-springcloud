package com.imis.springcloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: zcx
 * Date: Created in 2019/11/3 9:40
 * Version: 1.0
 */
@RestController
public class UserController {

    @RequestMapping("/userInfo")
    public String getUserInfo(){
        return "user_server";
    }
}
