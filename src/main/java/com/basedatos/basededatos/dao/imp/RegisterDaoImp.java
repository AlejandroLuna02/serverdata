package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class RegisterDaoImp implements RegisterDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<RegisterModel> getLAll(){
        String hql = "FROM RegisterModel as u";
        return (List<RegisterModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public RegisterModel getL(long id){
        return entityManager.find(RegisterModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public RegisterModel registerL(RegisterModel registerModel){
        entityManager.merge(registerModel); // TODO: merge => INSERT
        return registerModel;
    }
    @Transactional
    @Override
    public RegisterModel updateL(RegisterModel registerModel){
        entityManager.merge(registerModel);
        return registerModel;
    }
    @Transactional
    @Override
    public void deleteL(  long id){
        RegisterModel registerModel = getL(id);
        entityManager.remove(registerModel); // TODO: remove(modelo) => delete
    }
}
