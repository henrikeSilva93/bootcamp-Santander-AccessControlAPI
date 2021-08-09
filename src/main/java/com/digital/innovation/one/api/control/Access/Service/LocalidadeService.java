package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.Localidade;
import com.digital.innovation.one.api.control.Access.Model.TipoData;
import com.digital.innovation.one.api.control.Access.Repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    @Autowired
    LocalidadeRepository localidadeRepository;
    public List<Localidade> listarLocalidades(){
        return localidadeRepository.findAll();
    }
    public Optional<Localidade> findempresaById(Long id){
        return localidadeRepository.findById(id);
    }

    public Localidade criar(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void Atualizar(Localidade localidade){
        localidadeRepository.save(localidade);
    }

    public void Deletar(Long id){
        localidadeRepository.deleteById(id);
    }
}
