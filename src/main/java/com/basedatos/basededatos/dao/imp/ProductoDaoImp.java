package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.ProductoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ProductoDaoImp implements ProductoDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProductoModel> getPrAll(){
        String hql = "FROM ProductoModel as u";
        return (List< ProductoModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public ProductoModel getPr( long id){
        return entityManager.find(ProductoModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public ProductoModel registerPr( ProductoModel productoModel){
        entityManager.merge(productoModel); // TODO: merge => INSERT
        return productoModel;
    }
    @Transactional
    @Override
    public ProductoModel updatePr( ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public void deletePr(  long id){
        ProductoModel productoModel = getPr(id);
        entityManager.remove(productoModel); // TODO: remove(modelo) => delete
    }
}
