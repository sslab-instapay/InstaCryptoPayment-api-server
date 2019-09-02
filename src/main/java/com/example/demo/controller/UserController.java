package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<User> getUserInformation(){
        // JWT 토큰을 통해 유저 아이디? 나 ㄱ런 것들 얻고 그것을 통해서 db에서 불러온다음~~

        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User create(){
        User user = new User();
        user.setEmail("cbh12032@gmail.com");
        user.setPassword("as789456");
        user.setName("채병훈");
        user.setWalletAddress("0xqtrjqtiji");
        return userService.save(user);
    }
}
