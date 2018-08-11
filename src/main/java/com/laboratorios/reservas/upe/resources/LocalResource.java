package com.laboratorios.reservas.upe.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorios.reservas.upe.domain.Local;
import com.laboratorios.reservas.upe.services.LocalService;

@RestController
@RequestMapping(value="/locais")
public class LocalResource {
	
	@Autowired
	private LocalService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Local obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
