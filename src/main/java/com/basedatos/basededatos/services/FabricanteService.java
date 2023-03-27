package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.FabricanteDaoImp;
import com.basedatos.basededatos.dao.imp.GasDaoImp;
import com.basedatos.basededatos.dao.imp.RegisterDaoImp;
import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class FabricanteService {

    @Autowired
    FabricanteDaoImp FabricanteDao;

    public List<FabricanteModel> getAll(){
        return FabricanteDao.getFAll();
    }
    public FabricanteModel register(FabricanteModel fabricanteModel){
        return FabricanteDao.registerF(fabricanteModel);
    }

    public FabricanteModel update(@RequestBody FabricanteModel fabricanteModel){return FabricanteDao.updateF(fabricanteModel);
    }

    public void delete(@PathVariable long id){
        FabricanteDao.deleteF(id);
    }
}
