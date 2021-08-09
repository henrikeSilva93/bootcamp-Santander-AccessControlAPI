package com.digital.innovation.one.api.control.Access.Controller;

import com.digital.innovation.one.api.control.Access.Model.Empresa;
import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Repository.EmpresaRepository;
import com.digital.innovation.one.api.control.Access.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;
    @GetMapping
    public List<Empresa> ListarEmpresas(){
        return empresaService.listarEmpresas();
    }
    @GetMapping("/{id}")
    public Optional<Empresa> listarPorId(@PathVariable("id") Long id){

        return empresaService.findempresaById(id);
    }

    @PostMapping
    public Empresa CriarEmpresa(@RequestBody Empresa empresa){

        return  empresaService.criar(empresa);
    }

    @PutMapping
    public void Atualizar(@RequestBody Empresa empresa){
         empresaService.Atualizar(empresa);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){

        empresaService.Deletar(id);
    }
}
