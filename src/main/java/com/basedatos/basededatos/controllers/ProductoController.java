package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.FabricanteService;
import com.basedatos.basededatos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/getAll")
    List<ProductoModel> getAll(){
        return productoService.getAll();
    }

    @PostMapping(value = "/create")
    ProductoModel create(@RequestBody ProductoModel productoModel){
        return productoService.register(productoModel);
    }

    @PutMapping(value = "/update/{id}")
    ProductoModel update(@RequestBody ProductoModel productoModel ){
        return productoService.update(productoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  delete(@PathVariable("id") long id){
        productoService.delete(id);
    }
}
