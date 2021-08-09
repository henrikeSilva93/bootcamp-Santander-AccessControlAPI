package com.digital.innovation.one.api.control.Access.Controller;

import com.digital.innovation.one.api.control.Access.Model.BancoHoras;
import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bancohoras")

public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;
    @GetMapping
    public List<BancoHoras> ListarBancoHoras(){
        return bancoHorasService.listarBancoHoras();
    }
    @GetMapping("/{id}")
    public Optional<BancoHoras> listarPorId(@PathVariable("id") Long id){

        return bancoHorasService.findBancoHorasById(id);
    }

    @PostMapping
    public  BancoHoras CriarBancoHora (@RequestBody BancoHoras bancoHoras){

        return  bancoHorasService.criar(bancoHoras);
    }

    @PutMapping
    public void Atualizar(@RequestBody BancoHoras bancoHoras){
        bancoHorasService.Atualizar(bancoHoras);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        bancoHorasService.Deletar(id);
    }
}
