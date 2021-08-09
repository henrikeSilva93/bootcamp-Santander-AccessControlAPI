package com.digital.innovation.one.api.control.Access.Controller;

import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> ListarUsuarios(){
        return usuarioService.listUsers();
    }
    @GetMapping("/{id}")
    public Optional<Usuario> listarPorId(@PathVariable("id") Long id){
        return usuarioService.findByid(id);
    }

    @PostMapping
   public Usuario CriarUsuario(@RequestBody Usuario usuario){
        return  usuarioService.criarUsuario(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuario> Atualizar(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.criarUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        usuarioService.Deletar(id);
    }

}
