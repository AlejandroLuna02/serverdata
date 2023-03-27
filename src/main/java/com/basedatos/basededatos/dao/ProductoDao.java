package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.ProductoModel;

import java.util.List;

public interface ProductoDao {
    List<ProductoModel> getPrAll();
    ProductoModel getPr( long id);
    ProductoModel registerPr( ProductoModel productoModel);
    ProductoModel updatePr( ProductoModel productoModel);
    void deletePr(  long id);
}
