package com.laboratorios.reservas.upe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorios.reservas.upe.domain.HorarioFinal;

@Repository
public interface HorarioFinalRepository extends JpaRepository<HorarioFinal, Integer>{

}
