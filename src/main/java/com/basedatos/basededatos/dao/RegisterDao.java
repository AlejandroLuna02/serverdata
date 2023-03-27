package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.RegisterModel;

import java.util.List;

public interface RegisterDao {
    List<RegisterModel> getLAll();
    RegisterModel getL(long id);
    RegisterModel registerL(RegisterModel registerModel);
    RegisterModel updateL(RegisterModel registerModel);
    void deleteL(  long id);
}
