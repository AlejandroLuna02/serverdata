package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.GasDaoImp;
import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.ProfileTwoModel;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class GasService {
    @Autowired
    GasDaoImp Gas_Dao;

    public List<GasModel> getAll(){
        return Gas_Dao.getGAll();
    }
    public GasModel register( GasModel gasModel){
        return Gas_Dao.registerG(gasModel);
    }

    public GasModel update(@RequestBody GasModel gasModel){
        return Gas_Dao.updateG(gasModel);
    }

    public void delete(@PathVariable long id){
        Gas_Dao.deleteG(id);
    }
}
