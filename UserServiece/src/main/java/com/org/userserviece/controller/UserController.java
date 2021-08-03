package com.org.userserviece.controller;

import com.org.userserviece.VO.ResponseTemplateVO;
import com.org.userserviece.entity.User;
import com.org.userserviece.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * created with love by mundiaem
 * created on 28/07/2021
 * Time: 13:12
 * ⚡  - UserServiece
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    private final static String TAG= UserController.class.getName();
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User seveUser(@RequestBody User user) {
        System.out.printf("******* Save User @ %s and User is  %s%n", TAG, "-------");
        log.info(String.format("******* Save User @ %s and User is  %s", TAG, user.toString()));
        return userService.saveUser(user);
    }
    @GetMapping("{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") long userId){
        log.info(String.format("Inside getUserWithDepartment of %s", TAG));
        return userService.getUserWithDepartment(userId);
    }


}
