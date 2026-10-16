package com.sena.apiparking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.apiparking.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

	Optional<Vehiculo> findFirstByPlaca(String placa);
	
	
	
}
