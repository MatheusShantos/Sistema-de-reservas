package com.laboratorios.reservas.upe.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorios.reservas.upe.domain.Local;

@RestController
@RequestMapping(value="/locais")
public class LocalResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Local> find() {
		
		Local loc1 = new Local(1, "Labortório de informática", "lab para todo o uso da universidade");
		Local loc2 = new Local(2, "Auditório", "local para palestra e eventos da universidade");
		
		List<Local> lista = new ArrayList<>();
		lista.add(loc1);
		lista.add(loc2);
		
		return lista;
	}
}
