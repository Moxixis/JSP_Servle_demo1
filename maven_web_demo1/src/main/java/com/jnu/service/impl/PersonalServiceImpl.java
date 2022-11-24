package com.jnu.service.impl;

import com.jnu.dao.IUserDao;
import com.jnu.domain.User;
import com.jnu.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalServiceImpl implements IPersonalService {
    @Autowired
    private IUserDao dao = null;

    @Override
    public boolean update(String now_userName, String userName, String password, String name, String sno, String gender, String per_class, String IDnumber, String age, String addr, String mor_up, String eve_sleep, String bestfood, String fav_place, String fav_idol, String fav_book, String hobby) {
        //登录状态
        boolean loginState = false;
        User user = dao.queryUserByName(userName);
        if (user == null) {
            loginState = true;
            dao.updateUser(now_userName, userName, password, name, sno, gender, per_class, IDnumber, age, addr, mor_up, eve_sleep, bestfood, fav_place, fav_idol, fav_book, hobby);
        }
        return loginState;
    }
}
