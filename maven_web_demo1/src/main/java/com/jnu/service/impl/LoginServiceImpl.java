package com.jnu.service.impl;

import com.jnu.dao.IUserDao;
import com.jnu.domain.User;
import com.jnu.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private IUserDao dao = null;

    @Override
    public boolean login(String userName, String password) {
        //登录状态
        boolean loginState = false;
        User user = dao.queryUserByName(userName);
        if (user != null) {
            loginState = password.equals(user.getPassword());
        }
        return loginState;
    }
}
