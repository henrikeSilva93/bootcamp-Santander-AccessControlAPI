package com.digital.innovation.one.api.control.Access.Service;



import com.digital.innovation.one.api.control.Access.Model.CategoriaUsuario;
import com.digital.innovation.one.api.control.Access.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public List<CategoriaUsuario> listarCategorias(){
        return categoriaRepository.findAll();
    }
    public Optional<CategoriaUsuario> findCategoriaById(Long id){
        return categoriaRepository.findById(id);
    }

    public CategoriaUsuario criar(CategoriaUsuario categoria){
        return categoriaRepository.save(categoria);
    }

    public void Atualizar(CategoriaUsuario categoria){
        categoriaRepository.save(categoria);
    }

    public void Deletar(Long id){
        categoriaRepository.deleteById(id);
    }
}
