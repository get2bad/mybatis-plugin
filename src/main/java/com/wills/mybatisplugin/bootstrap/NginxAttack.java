package com.wills.mybatisplugin.bootstrap;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName NginxAttack
 * @Date 2022/1/13 17:07
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
public class NginxAttack implements Runnable{

    @Override
    public void run() {
        boolean flag = true;
        while(flag){
            HttpUtil.get("https://192.168.0.189:5443/#/login");
//            System.out.println(Thread.currentThread().getName() + "\r\n" + post);
//            flag = false;
        }
    }
}
