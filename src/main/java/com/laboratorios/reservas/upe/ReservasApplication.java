package com.laboratorios.reservas.upe;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.laboratorios.reservas.upe.domain.HorarioFinal;
import com.laboratorios.reservas.upe.domain.HorarioInicial;
import com.laboratorios.reservas.upe.domain.Local;
import com.laboratorios.reservas.upe.domain.Reserva;
import com.laboratorios.reservas.upe.domain.Usuario;
import com.laboratorios.reservas.upe.enums.TipoUsuario;
import com.laboratorios.reservas.upe.repositories.HorarioFinalRepository;
import com.laboratorios.reservas.upe.repositories.HorarioInicialRepository;
import com.laboratorios.reservas.upe.repositories.LocalRepository;
import com.laboratorios.reservas.upe.repositories.ReservaRepository;
import com.laboratorios.reservas.upe.repositories.UsuarioRepository;

@SpringBootApplication
public class ReservasApplication implements CommandLineRunner{
	
	@Autowired
	private LocalRepository localRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private ReservaRepository reservaRepository;
	@Autowired
	private HorarioInicialRepository horarioInicialRepository;
	@Autowired
	private HorarioFinalRepository horarioFinalRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ReservasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Local loc1 = new Local(null,"Lab 1","Desc");
		Local loc2 = new Local(null,"Auditorio","Desc");
		
		Usuario user1 = new Usuario(null,"Matheus","matheus@upe.com","senha",TipoUsuario.ADIMININSTRADOR);
		Usuario user2 = new Usuario(null,"Teste","test@upe.com","senha",TipoUsuario.PROFESSOR);
		
		user1.getTelefones().addAll(Arrays.asList("(87)99999-9999","(87)98888-8888"));
		user2.getTelefones().addAll(Arrays.asList("(87)97777-7777","(87)96666-6666"));
		
		HorarioInicial horarioIni1 = new HorarioInicial(null,"07:30", "Disponível");
		HorarioInicial horarioIni2 = new HorarioInicial(null,"08:20", "Disponível");
		HorarioInicial horarioIni3 = new HorarioInicial(null,"09:10", "Disponível");
		HorarioInicial horarioIni4 = new HorarioInicial(null,"10:00", "Disponível");
		HorarioInicial horarioIni5 = new HorarioInicial(null,"10:50", "Disponível");
		HorarioInicial horarioIni6 = new HorarioInicial(null,"11:40", "Disponível");
		
		HorarioFinal horarioFim1 = new HorarioFinal(null,"08:20", "Disponível");
		HorarioFinal horarioFim2 = new HorarioFinal(null,"09:10", "Disponível");
		HorarioFinal horarioFim3 = new HorarioFinal(null,"10:00", "Disponível");
		HorarioFinal horarioFim4 = new HorarioFinal(null,"10:50", "Disponível");
		HorarioFinal horarioFim5 = new HorarioFinal(null,"11:40", "Disponível");
		HorarioFinal horarioFim6 = new HorarioFinal(null,"12:30", "Disponível");
		
		Reserva reserv1 = new Reserva(null, null, null, loc1, user1);
		Reserva reserv2 = new Reserva(null, null, null, loc2, user2);
		Reserva reserv3 = new Reserva(null, null, null, loc2, user1);
		
		loc1.getReservas().addAll(Arrays.asList(reserv1));
		loc2.getReservas().addAll(Arrays.asList(reserv2));
		
		user1.getReservas().addAll(Arrays.asList(reserv1, reserv3));
		user2.getReservas().addAll(Arrays.asList(reserv2));
		
		localRepository.saveAll(Arrays.asList(loc1,loc2));
		usuarioRepository.saveAll(Arrays.asList(user1,user2));
		horarioInicialRepository.saveAll(Arrays.asList(horarioIni1,horarioIni2,horarioIni3,horarioIni4,horarioIni5,horarioIni6));
		horarioFinalRepository.saveAll(Arrays.asList(horarioFim1,horarioFim2,horarioFim3,horarioFim4,horarioFim5,horarioFim6));
		reservaRepository.saveAll(Arrays.asList(reserv1,reserv2,reserv3));
	}
}
