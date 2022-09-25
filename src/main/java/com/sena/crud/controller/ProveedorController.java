package com.sena.crud.controller;

import com.sena.crud.entity.Proveedor;
import com.sena.crud.repository.IProveedorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProveedorController {

    private final IProveedorRepository iProveedorRepository;

    public ProveedorController(IProveedorRepository iProveedorRepository) {
        this.iProveedorRepository = iProveedorRepository;
    }

    @GetMapping("/proveedor")
    public List<Proveedor> All() {return iProveedorRepository.findAll();}

    @PostMapping("/proveedor")
    public Proveedor NewProvedor(@RequestBody Proveedor newProveedor) {return iProveedorRepository.save(newProveedor);}

    @DeleteMapping("proveedor/{id}")
    public void DeleteProveedor(@PathVariable long id){
        iProveedorRepository.deleteById(id);
    }
}
