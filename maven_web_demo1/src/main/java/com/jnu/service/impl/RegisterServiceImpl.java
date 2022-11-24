package com.jnu.service.impl;

import com.jnu.dao.IUserDao;
import com.jnu.domain.User;
import com.jnu.service.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements IRegisterService {
    @Autowired
    private IUserDao dao = null;

    @Override
    public boolean register(String userName, String password, String idpassword) {
        //注册状态
        boolean registerState = false;
        User user = dao.queryUserByName(userName);
        if (user == null && password.equals(idpassword) && !password.equals("") && !userName.equals("")) {
            dao.addUser(userName, password);
            registerState = true;
        }
        return registerState;
    }
}
