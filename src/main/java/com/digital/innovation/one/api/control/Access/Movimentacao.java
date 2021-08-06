package com.digital.innovation.one.api.control.Access;

import com.digital.innovation.one.api.control.Access.Model.Calendario;
import com.digital.innovation.one.api.control.Access.Model.Ocorrencia;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Movimentacao {
    @Data
    @Builder
    @Embeddable
    @Entity
    public class movimentacaoId implements Serializable {
       @Id
        private Long idMovimento;
       @Id
        private Long idUsuario;

    }
    @EmbeddedId
    @Id
    private movimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
