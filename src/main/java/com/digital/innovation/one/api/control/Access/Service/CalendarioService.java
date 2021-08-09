package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.Calendario;
import com.digital.innovation.one.api.control.Access.Model.TipoData;
import com.digital.innovation.one.api.control.Access.Repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    @Autowired
    CalendarioRepository calendarioRepository;

    public List<Calendario> listarTipoDatas(){
        return calendarioRepository.findAll();
    }
    public Optional<Calendario> findCalendarioById(Long id){
        return calendarioRepository.findById(id);
    }

    public Calendario criar(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public void Atualizar(Calendario calendario){
        calendarioRepository.save(calendario);
    }

    public void Deletar(Long id){
        calendarioRepository.deleteById(id);
    }

}
