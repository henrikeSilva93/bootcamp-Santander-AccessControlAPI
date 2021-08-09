package com.digital.innovation.one.api.control.Access.Model;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Setter
@Getter
@EnableJpaAuditing
public class JornadaTrabalho {
    @Id
    @GeneratedValue()
    private Long id;
    private String descricao;


}
