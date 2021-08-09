package com.digital.innovation.one.api.control.Access.Repository;

import com.digital.innovation.one.api.control.Access.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
