package com.laboratorios.reservas.upe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorios.reservas.upe.domain.Local;
import com.laboratorios.reservas.upe.repositories.LocalRepository;

@Service
public class LocalService {

	@Autowired
	private LocalRepository repo;
	
	public Local find(Integer id) {
		Optional<Local> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
