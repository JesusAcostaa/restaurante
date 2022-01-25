package com.restaurante.aplicacion;

import com.restaurante.dominio.Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ComidaService extends JpaRepository<Comida, UUID> {


}
