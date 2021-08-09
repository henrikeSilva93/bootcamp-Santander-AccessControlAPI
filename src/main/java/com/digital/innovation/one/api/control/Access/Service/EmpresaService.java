package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.Empresa;
import com.digital.innovation.one.api.control.Access.Model.Usuario;
import com.digital.innovation.one.api.control.Access.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;


    public List<Empresa> listarEmpresas(){
        return empresaRepository.findAll();
    }
    public Optional<Empresa> findempresaById(Long id){
        return empresaRepository.findById(id);
    }

    public Empresa criar(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void Atualizar(Empresa empresa){
        empresaRepository.save(empresa);
    }

    public void Deletar(Long id){
        empresaRepository.deleteById(id);
    }
}


