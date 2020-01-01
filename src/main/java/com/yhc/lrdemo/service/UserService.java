package com.yhc.lrdemo.service;

import com.yhc.lrdemo.dao.UserDao;
import com.yhc.lrdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User FindNameAndPsw(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
    public void save(User user1) {
        userDao.save(user1);
    }
    public List<User> findByName(String username) {
        return userDao.findByUsername(username);
    }
}
