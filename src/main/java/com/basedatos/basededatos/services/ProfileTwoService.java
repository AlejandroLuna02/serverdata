package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProfileTwoDao;
import com.basedatos.basededatos.dao.UserDao;
import com.basedatos.basededatos.models.ProfileTwoModel;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProfileTwoService {
    @Autowired
    ProfileTwoDao profileTwoDao;

    public List<ProfileTwoModel> getAll(){
        return profileTwoDao.getPAll();
    }
    public ProfileTwoModel register( ProfileTwoModel profileTwoModel){
        return profileTwoDao.registerP(profileTwoModel);
    }


}
