package com.basedatos.basededatos.dao.imp;


import com.basedatos.basededatos.dao.Gas_Dao;
import com.basedatos.basededatos.models.GasModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class GasDaoImp implements Gas_Dao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<GasModel> getGAll(){
        String hql = "FROM GasModel as u";
        return (List< GasModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public GasModel getG( long id){
        return entityManager.find(GasModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public GasModel registerG( GasModel gasModel){
        entityManager.merge(gasModel); // TODO: merge => INSERT
        return gasModel;
    }
    @Transactional
    @Override
    public GasModel updateG( GasModel gasModel){
        entityManager.merge(gasModel);
        return gasModel;
    }
    @Transactional
    @Override
    public void deleteG(  long id){
        GasModel gasModel = getG(id);
        entityManager.remove(gasModel); // TODO: remove(modelo) => delete
    }
}
