package com.jnu.model.impl;

import com.jnu.model.IPersonalModel;
import org.springframework.beans.factory.annotation.Autowired;
import com.jnu.service.IPersonalService;
import org.springframework.stereotype.Component;

@Component
public class PersonalModelImpl implements IPersonalModel {
    @Autowired
    private IPersonalService service = null;

    @Override
    public boolean update(String now_userName, String userName, String password, String name, String sno, String gender, String per_class, String IDnumber, String age, String addr, String mor_up, String eve_sleep, String bestfood, String fav_place, String fav_idol, String fav_book, String hobby) {
        return service.update(now_userName, userName, password, name, sno, gender, per_class, IDnumber, age, addr, mor_up, eve_sleep, bestfood, fav_place, fav_idol, fav_book, hobby);
    }
}
