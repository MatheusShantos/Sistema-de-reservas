package com.laboratorios.reservas.upe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorios.reservas.upe.domain.HorarioInicial;
import com.laboratorios.reservas.upe.repositories.HorarioInicialRepository;
import com.laboratorios.reservas.upe.services.exceptions.ObjectNotFoundException;

@Service
public class HorarioInicioService {
	
	@Autowired
	private HorarioInicialRepository repo;
	
	public HorarioInicial find(Integer id) {
		Optional<HorarioInicial> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + HorarioInicial.class.getName()));
		}
}
