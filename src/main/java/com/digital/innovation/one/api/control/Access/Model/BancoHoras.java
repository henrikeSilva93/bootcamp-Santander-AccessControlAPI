package com.digital.innovation.one.api.control.Access.Model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
public class BancoHoras {
    @Data
    @Builder
    @Embeddable
    public class BancoHorasId implements Serializable{

        private Long bancoHorasId;

        private Long idUsuario;

        private Long idMovimento;


    }
    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;

}
