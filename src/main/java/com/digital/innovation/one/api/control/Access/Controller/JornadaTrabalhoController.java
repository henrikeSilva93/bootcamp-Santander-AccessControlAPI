package com.digital.innovation.one.api.control.Access.Controller;

import com.digital.innovation.one.api.control.Access.Model.JornadaTrabalho;
import com.digital.innovation.one.api.control.Access.Service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
@ResponseBody


public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;
    @GetMapping
    public List<JornadaTrabalho> listJornada(){
        System.out.println(jornadaTrabalhoService.findAll());
        return jornadaTrabalhoService.findAll();
    }
    @GetMapping("jornada/{id}")
    public JornadaTrabalho getJornadaById(@PathVariable(value = "id") Long id){
        return jornadaTrabalhoService.findById(id).orElseThrow(()-> new NoSuchElementException());


    }

    @PostMapping

    public JornadaTrabalho createJornada( @RequestBody JornadaTrabalho jornadaTrabalho){

        return jornadaTrabalhoService.Save(jornadaTrabalho);
    }

  @PutMapping
    public JornadaTrabalho UpadateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
  }

  @DeleteMapping("jornada/{id}")
  public void deletarJornada(@PathVariable(value = "id") Long id){
        jornadaTrabalhoService.delete(id);
  }


}
