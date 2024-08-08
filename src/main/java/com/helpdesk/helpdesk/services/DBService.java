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

// Criar instâncias de Tecnico
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "12345678941", "valdircezar@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Tecnico tec2 = new Tecnico(null, "Ana Souza", "98765432100", "ana.souza@example.com", "senha123");
		tec2.addPerfil(Perfil.ADMIN);

		Tecnico tec3 = new Tecnico(null, "Carlos Silva", "32145698700", "carlos.silva@example.com", "senha456");
		tec3.addPerfil(Perfil.ADMIN);

		Tecnico tec4 = new Tecnico(null, "Julia Mendes", "45678912300", "julia.mendes@example.com", "senha789");
		tec4.addPerfil(Perfil.ADMIN);

		Tecnico tec5 = new Tecnico(null, "Roberto Lima", "67890123456", "roberto.lima@example.com", "senha321");
		tec5.addPerfil(Perfil.ADMIN);

// Criar instâncias de Cliente
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "1234565879", "linus@gmail.com", "123");

		Cliente cli2 = new Cliente(null, "Grace Hopper", "1122334455", "grace.hopper@example.com", "senha789");

		Cliente cli3 = new Cliente(null, "Alan Turing", "5566778899", "alan.turing@example.com", "senha321");

		Cliente cli4 = new Cliente(null, "Ada Lovelace", "2233445566", "ada.lovelace@example.com", "senha654");

		Cliente cli5 = new Cliente(null, "Claude Shannon", "9988776655", "claude.shannon@example.com", "senha987");

// Criar instâncias de Chamado
		Chamado c1 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		Chamado c2 = new Chamado(null, Prioridade.MEDIA, Status.FINALIZADO, "Chamado 02", "Segundo chamado", tec2, cli2);

		Chamado c3 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 03", "Terceiro chamado", tec3, cli3);

		Chamado c4 = new Chamado(null, Prioridade.BAIXA, Status.FINALIZADO, "Chamado 04", "Quarto chamado", tec4, cli4);

		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 05", "Quinto chamado", tec5, cli5);



		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
    }
    
}
