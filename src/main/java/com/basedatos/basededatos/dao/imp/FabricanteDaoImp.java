package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.FabricanteDao;
import com.basedatos.basededatos.models.FabricanteModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class FabricanteDaoImp implements FabricanteDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<FabricanteModel> getFAll(){
        String hql = "FROM FabricanteModel as u";
        return (List< FabricanteModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public FabricanteModel getF( long id){
        return entityManager.find(FabricanteModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public FabricanteModel registerF( FabricanteModel fabricanteModel){
        entityManager.merge(fabricanteModel); // TODO: merge => INSERT
        return fabricanteModel;
    }
    @Transactional
    @Override
    public FabricanteModel updateF( FabricanteModel fabricanteModel){
        entityManager.merge(fabricanteModel);
        return fabricanteModel;
    }
    @Transactional
    @Override
    public void deleteF(  long id){
        FabricanteModel fabricanteModel = getF(id);
        entityManager.remove(fabricanteModel); // TODO: remove(modelo) => delete
    }
}
