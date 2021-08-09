package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.Empresa;
import com.digital.innovation.one.api.control.Access.Model.Ocorrencia;
import com.digital.innovation.one.api.control.Access.Repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public List<Ocorrencia> listarOcorrencias(){
        return ocorrenciaRepository.findAll();
    }
    public Optional<Ocorrencia> findempresaById(Long id){
        return ocorrenciaRepository.findById(id);
    }

    public Ocorrencia criar(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void Atualizar(Ocorrencia ocorrencia){
        ocorrenciaRepository.save(ocorrencia);
    }

    public void Deletar(Long id){
        ocorrenciaRepository.deleteById(id);
    }
}
