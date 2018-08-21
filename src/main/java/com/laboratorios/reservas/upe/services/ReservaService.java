package com.laboratorios.reservas.upe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorios.reservas.upe.domain.Reserva;
import com.laboratorios.reservas.upe.repositories.ReservaRepository;
import com.laboratorios.reservas.upe.services.exceptions.ObjectNotFoundException;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository repo;
	
	public Reserva find(Integer id) {
		Optional<Reserva> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Reserva.class.getName()));
		}
}
