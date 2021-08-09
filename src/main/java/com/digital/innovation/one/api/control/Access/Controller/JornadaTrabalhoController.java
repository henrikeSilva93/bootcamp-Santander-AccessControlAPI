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
    @GetMapping("/{id}")
    public JornadaTrabalho getJornadaById(@PathVariable("id") Long id){
        return jornadaTrabalhoService.findById(id).orElseThrow(()-> new NoSuchElementException());


    }

    @PostMapping

    public JornadaTrabalho createJornada( @RequestBody JornadaTrabalho jornadaTrabalho){

        return jornadaTrabalhoService.Save(jornadaTrabalho);
    }

  @PutMapping
    public void UpadateJornada( @RequestBody JornadaTrabalho jornadaTrabalho) throws Exception {
         jornadaTrabalhoService.update(jornadaTrabalho);
  }

  @DeleteMapping("/{id}")
  public void deletarJornada(@PathVariable("id") Long id){
        jornadaTrabalhoService.delete(id);
  }


}
