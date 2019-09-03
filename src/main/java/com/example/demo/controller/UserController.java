package com.example.demo.controller;

import com.example.demo.model.Store;
import com.example.demo.model.User;
import com.example.demo.model.UserType;
import com.example.demo.service.StoreService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    StoreService storeService;

    @GetMapping
    public ResponseEntity<User> getUserInformation(Authentication authentication){
        // JWT 토큰을 통해 유저 아이디? 나 ㄱ런 것들 얻고 그것을 통해서 db에서 불러온다음~~

        return null;
    }

    @PostMapping
    public User create(){
        User user = new User();
        user.setEmail("seller@gmail.com");
        user.setPassword("as789456");
        user.setName("신동민");
        user.setWalletAddress("0xqtrjqtiji");
        user.setUserType(UserType.SELLER);
        return userService.createUser(user);
    }

    @PostMapping(value = "/stores")
    public Store createStore(@RequestBody Map<String, Object> params, @AuthenticationPrincipal UserDetails userDetails){

        System.out.println(userDetails.getUsername());
        return userService.registerStore(new Store(params.get("name").toString(), params.get("description").toString()), userDetails);
    }

    @GetMapping(value = "/stores")
    public ResponseEntity getStore(@AuthenticationPrincipal UserDetails userDetails){

        Store userStore = userService.getUserStore(userDetails);

        if (userStore == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(userStore);
    }


}
