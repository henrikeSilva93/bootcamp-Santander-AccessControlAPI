package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.BancoHoras;
import com.digital.innovation.one.api.control.Access.Model.TipoData;
import com.digital.innovation.one.api.control.Access.Repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
  @Autowired
    BancoHorasRepository bancoHorasRepository;
    public List<BancoHoras> listarBancoHoras(){
        return bancoHorasRepository.findAll();
    }
    public Optional<BancoHoras> findBancoHorasById(Long id){
        return bancoHorasRepository.findById(id);
    }

    public BancoHoras criar(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void Atualizar(BancoHoras bancoHoras){
        bancoHorasRepository.save(bancoHoras);
    }

    public void Deletar(Long id){
     bancoHorasRepository.deleteById(id);
    }
}
