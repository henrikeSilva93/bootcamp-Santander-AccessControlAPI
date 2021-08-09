package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listUsers(){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> findByid(Long id){
        return usuarioRepository.findById(id);
    }

    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void AtualizarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void Deletar(Long id){
        usuarioRepository.deleteById(id);
    }
}
