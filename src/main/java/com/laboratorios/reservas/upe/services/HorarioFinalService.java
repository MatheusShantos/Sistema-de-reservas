package com.laboratorios.reservas.upe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorios.reservas.upe.domain.HorarioFinal;
import com.laboratorios.reservas.upe.repositories.HorarioFinalRepository;
import com.laboratorios.reservas.upe.services.exceptions.ObjectNotFoundException;

@Service
public class HorarioFinalService {
	
	@Autowired
	private HorarioFinalRepository repo;
	
	public HorarioFinal find(Integer id) {
		Optional<HorarioFinal> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + HorarioFinal.class.getName()));
		}
}
