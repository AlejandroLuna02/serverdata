package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.services.FabricanteService;
import com.basedatos.basededatos.services.GasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/fabricante")

public class FabricanteController {
    @Autowired
    FabricanteService fabricanteService;

    @GetMapping("/getAll")
    List<FabricanteModel> getAll(){
        return fabricanteService.getAll();
    }

    @PostMapping(value = "/create")
    FabricanteModel create(@RequestBody FabricanteModel fabricanteModel){
        return fabricanteService.register(fabricanteModel);
    }

    @PutMapping(value = "/update/{id}")
    FabricanteModel update(@RequestBody FabricanteModel fabricanteModel ){
        return fabricanteService.update(fabricanteModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  delete(@PathVariable("id") long id){
        fabricanteService.delete(id);
    }
}
