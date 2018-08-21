package com.laboratorios.reservas.upe.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorios.reservas.upe.domain.HorarioInicial;
import com.laboratorios.reservas.upe.services.HorarioInicioService;

@RestController
@RequestMapping(value="/horarios/inicio")
public class HorarioInicialResource {
	
	@Autowired
	private HorarioInicioService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		HorarioInicial obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
