package com.digital.innovation.one.api.control.Access.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class NivelAcesso {
    @Id
    private Long id;
    private String descricao;
}
