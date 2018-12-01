package com.coco.winter.login.service;

import com.coco.winter.login.entity.UserInfo;
import org.apache.catalina.User;

import java.util.Map;

/**
 * @ClassName UserService
 * @Description 用户service接口
 * @Author like
 * @Data 2018/11/10 14:17
 * @Version 1.0
 **/

public interface UserService {

    UserInfo fingByUserName(String userName);

    boolean insertUser(String userName, String passWord);

    UserInfo userLogin(Map<String,Object> map) throws Exception;
}
