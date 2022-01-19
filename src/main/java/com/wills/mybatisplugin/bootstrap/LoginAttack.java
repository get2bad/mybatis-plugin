package com.wills.mybatisplugin.bootstrap;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LoginAttack
 * @Date 2022/1/13 17:07
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
public class LoginAttack implements Runnable{

    @Override
    public void run() {
        boolean flag = true;
        while(flag){
            Map<String,Object> json = new HashMap<>();
            json.put("username","tong");
            json.put("password","tong");
            String post = HttpUtil.post("https://192.168.0.189:5443/api/login", json);
            System.out.println(Thread.currentThread().getName() + "\r\n" + post);
//            flag = false;
        }
    }
}
