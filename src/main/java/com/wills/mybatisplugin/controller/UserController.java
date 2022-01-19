package com.wills.mybatisplugin.controller;

import com.wills.mybatisplugin.entity.User;
import com.wills.mybatisplugin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Date 2022/1/13 14:16
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "getOneById/{userId}")
    public User getOneById(@PathVariable Integer userId){
        return userMapper.getOneById(userId);
    }

    @PostMapping("save")
    public String save(@RequestBody User user){
        userMapper.save(user);
        return "ok";
    }
}
