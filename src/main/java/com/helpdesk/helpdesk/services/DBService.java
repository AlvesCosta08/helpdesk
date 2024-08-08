package com.helpdesk.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.helpdesk.domain.Chamado;
import com.helpdesk.helpdesk.domain.Cliente;
import com.helpdesk.helpdesk.domain.Tecnico;
import com.helpdesk.helpdesk.domain.enums.Perfil;
import com.helpdesk.helpdesk.domain.enums.Prioridade;
import com.helpdesk.helpdesk.domain.enums.Status;
import com.helpdesk.helpdesk.repository.ChamadoRepository;
import com.helpdesk.helpdesk.repository.ClienteRepository;
import com.helpdesk.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {
    	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;
    public void instaciaDB(){
        		Tecnico tec1 = new Tecnico(null,"Valdir Cezar","12345678941","valdircezar@gmail.com","123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null,"Linus Torvalds","1234565879","linus@gmail.com","123");

		Chamado c1 = new Chamado(null,Prioridade.BAIXA,Status.ANDAMENTO,"Chamado 01","Primeiro chamado",tec1,cli1);

		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
    }
    
}
