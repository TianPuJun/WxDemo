package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 * @author cui
 * @create 2018-05-17 15:04
 **/
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName(int id) {
        System.out.println("-------getName------");
        return "Tom";
    }

    @Override
    public String getAge(int id) {
        System.out.println("--------getAge--------");
        return "18";
    }
}
