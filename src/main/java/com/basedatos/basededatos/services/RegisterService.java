package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.RegisterDaoImp;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class RegisterService {

    @Autowired
    RegisterDaoImp LoginDao;

    public List<RegisterModel> getAll(){
        return LoginDao.getLAll();
    }
    public RegisterModel register(RegisterModel registerModel){
        return LoginDao.registerL(registerModel);
    }

    public RegisterModel update(@RequestBody RegisterModel registerModel){
        return LoginDao.updateL(registerModel);
    }

    public void delete(@PathVariable long id){
        LoginDao.deleteL(id);
    }
}
