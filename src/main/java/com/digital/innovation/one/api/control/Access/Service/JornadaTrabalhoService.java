package com.digital.innovation.one.api.control.Access.Service;

import com.digital.innovation.one.api.control.Access.Model.JornadaTrabalho;
import com.digital.innovation.one.api.control.Access.Repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {
    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho Save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }
    public List<JornadaTrabalho> findAll(){
        List<JornadaTrabalho> result = jornadaTrabalhoRepository.findAll();
        return result;
    }

    public Optional<JornadaTrabalho> findById(Long id){
        return jornadaTrabalhoRepository.findById(id);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public  void delete(Long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
