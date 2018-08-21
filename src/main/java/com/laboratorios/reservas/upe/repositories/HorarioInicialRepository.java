package com.laboratorios.reservas.upe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorios.reservas.upe.domain.HorarioInicial;

@Repository
public interface HorarioInicialRepository extends JpaRepository<HorarioInicial, Integer>{

}
