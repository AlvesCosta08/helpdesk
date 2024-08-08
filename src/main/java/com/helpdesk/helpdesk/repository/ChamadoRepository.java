package com.helpdesk.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helpdesk.helpdesk.domain.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado,Long> {

}
