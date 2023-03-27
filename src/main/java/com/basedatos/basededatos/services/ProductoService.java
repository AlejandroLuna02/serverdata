package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.FabricanteDaoImp;
import com.basedatos.basededatos.dao.imp.ProductoDaoImp;
import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoDaoImp ProductoDao;

    public List<ProductoModel> getAll(){
        return ProductoDao.getPrAll();
    }
    public ProductoModel register(ProductoModel productoModel){
        return ProductoDao.registerPr(productoModel);
    }

    public ProductoModel update(@RequestBody ProductoModel productoModel){return ProductoDao.updatePr(productoModel);
    }

    public void delete(@PathVariable long id){
        ProductoDao.deletePr(id);
    }
}
