package com.digital.innovation.one.api.control.Access.Repository;

import com.digital.innovation.one.api.control.Access.Model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
