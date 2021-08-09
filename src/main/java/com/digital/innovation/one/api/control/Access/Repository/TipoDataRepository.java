package com.digital.innovation.one.api.control.Access.Repository;

import com.digital.innovation.one.api.control.Access.Model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData,Long> {
}
