package com.evan.wj.dao;

import com.evan.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
//Dao层是一些数据库的基本操作，继承了JPA，使用封装好了的数据库操作.
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    User findUsersById(int id);
    User getByUsernameAndPassword(String username,String password);
}
