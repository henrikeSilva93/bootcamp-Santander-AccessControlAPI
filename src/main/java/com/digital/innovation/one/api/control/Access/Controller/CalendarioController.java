package com.digital.innovation.one.api.control.Access.Controller;

import com.digital.innovation.one.api.control.Access.Model.Calendario;
import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calendario")

public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;
    @GetMapping
    public List<Calendario> ListarCalendarios(){
        return calendarioService.listarTipoDatas();

    }
    @GetMapping("/{id}")
    public Optional<Calendario> listarPorId(@PathVariable("id") Long id){

        return calendarioService.findCalendarioById(id);
    }

    @PostMapping
    public Calendario CriarUsuario(@RequestBody Calendario calendario){
        return  calendarioService.criar(calendario);
    }

    @PutMapping
    public void Atualizar(@RequestBody Calendario calendario){
         calendarioService.Atualizar(calendario);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        calendarioService.Deletar(id);
    }
}
