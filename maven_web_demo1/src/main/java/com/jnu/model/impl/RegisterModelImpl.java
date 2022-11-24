package com.jnu.model.impl;

import com.jnu.model.IRegisterModel;
import com.jnu.service.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterModelImpl implements IRegisterModel {
    @Autowired
    private IRegisterService service = null;

    @Override
    public boolean register(String userName, String password, String idpassword) {
        return service.register(userName, password, idpassword);
    }
}
