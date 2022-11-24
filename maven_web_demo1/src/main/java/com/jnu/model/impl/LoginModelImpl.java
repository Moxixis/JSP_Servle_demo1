package com.jnu.model.impl;

import com.jnu.model.ILoginModel;
import com.jnu.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginModelImpl implements ILoginModel {
    @Autowired
    private ILoginService service = null;

    @Override
    public boolean login(String userName, String password) {
        return service.login(userName, password);
    }
}
