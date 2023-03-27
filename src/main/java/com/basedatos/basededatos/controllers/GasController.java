package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.ProfileTwoModel;
import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.GasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gas")

public class GasController {
    @Autowired
    GasService gasService;

    @GetMapping("/getAll")
    List<GasModel> getAll(){
        return gasService.getAll();
    }

    @PostMapping(value = "/create")
    GasModel create(@RequestBody GasModel gasModel){
        return gasService.register(gasModel);
    }

    @PutMapping(value = "/update/{id}")
    GasModel update(@RequestBody GasModel gasModel ){
        return gasService.update(gasModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  delete(@PathVariable("id") long id){
        gasService.delete(id);
    }
}
