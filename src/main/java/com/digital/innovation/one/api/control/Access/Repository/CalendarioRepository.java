package com.digital.innovation.one.api.control.Access.Repository;

import com.digital.innovation.one.api.control.Access.Model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
