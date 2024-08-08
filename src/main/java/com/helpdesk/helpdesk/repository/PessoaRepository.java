package com.helpdesk.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helpdesk.helpdesk.domain.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

}
