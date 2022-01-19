package com.wills.mybatisplugin.entity;

import com.wills.mybatisplugin.entity.dto.SplitDTO;
import lombok.Data;

/**
 * @ClassName User
 * @Date 2022/1/13 14:13
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
@Data
public class User extends SplitDTO {

    private Integer id;

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
