package com.jnu.dao;

import com.jnu.domain.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    void insertUser(User user);
//    void deleteUser(String userName);
//    List<User> queryALLUser();
    //根据用户名查找用户名和密码
    User queryUserByName(String userName);
    //添加新用户
    User addUser(@Param("userName") String userName, @Param("password") String password);
    void updateUser(@Param("now_userName") String now_userName, @Param("userName") String userName, @Param("password") String password, @Param("name") String name, @Param("sno") String sno, @Param("gender") String gender, @Param("per_class") String per_class, @Param("IDnumber") String IDnumber, @Param("age") String age, @Param("addr") String addr, @Param("mor_up") String mor_up, @Param("eve_sleep") String eve_sleep, @Param("bestfood") String bestfood, @Param("fav_place") String fav_place, @Param("fav_idol") String fav_idol, @Param("fav_book") String fav_book, @Param("hobby") String hobby);
}
