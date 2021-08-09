package com.digital.innovation.one.api.control.Access.Controller;

import com.digital.innovation.one.api.control.Access.Model.Localidade;
import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;
    @GetMapping
    public List<Localidade> ListarLocalidades(){
        return localidadeService.listarLocalidades();
    }
    @GetMapping("/{id}")
    public Optional<Localidade> listarPorId(@PathVariable("id") Long id){
        return localidadeService.findempresaById(id);
    }

    @PostMapping
    public Localidade Criarlocalidade(@RequestBody Localidade localidade){

        return  localidadeService.criar(localidade);
    }

    @PutMapping
    public void Atualizar(@RequestBody Localidade localidade){
       localidadeService.Atualizar(localidade);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){

       localidadeService.Deletar(id);
    }
}
