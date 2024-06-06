package com.proyectos_uts.app.repository;

import java.util.List;

import com.proyectos_uts.app.entity.EstudianteEntity;
import com.proyectos_uts.app.entity.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long>{

	EstudianteEntity findByCedulaAndContra(Long cedula, String contra);
}
