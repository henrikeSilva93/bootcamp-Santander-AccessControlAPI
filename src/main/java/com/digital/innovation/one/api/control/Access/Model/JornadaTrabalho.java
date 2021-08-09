package com.digital.innovation.one.api.control.Access.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Setter
@Getter
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String descricao;


}
