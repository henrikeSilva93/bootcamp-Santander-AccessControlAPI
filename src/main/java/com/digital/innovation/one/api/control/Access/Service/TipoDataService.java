package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.Empresa;
import com.digital.innovation.one.api.control.Access.Model.TipoData;
import com.digital.innovation.one.api.control.Access.Repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    @Autowired
    TipoDataRepository tipoDataRepository;
    public List<TipoData> listarTipoDatas(){
        return tipoDataRepository.findAll();
    }
    public Optional<TipoData> findempresaById(Long id){
        return tipoDataRepository.findById(id);
    }

    public TipoData criar(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void Atualizar(TipoData tipoData){
        tipoDataRepository.save(tipoData);
    }

    public void Deletar(Long id){
        tipoDataRepository.deleteById(id);
    }
}
