package com.example.demo.controller;


import com.example.demo.model.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {



    @RequestMapping(method = RequestMethod.GET)
    public UserDTO getUserInformation(){
        // JWT 토큰을 통해 유저 아이디? 나 ㄱ런 것들 얻고 그것을 통해서 db에서 불러온다음~~

        return null;
    }
}
