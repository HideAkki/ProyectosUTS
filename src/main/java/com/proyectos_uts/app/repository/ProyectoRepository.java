package com.proyectos_uts.app.repository;

import java.util.List;

import com.proyectos_uts.app.entity.DirectorEntity;
import com.proyectos_uts.app.entity.EstudianteEntity;
import com.proyectos_uts.app.entity.EvaluadorEntity;
import com.proyectos_uts.app.entity.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity, Long>{

	List<ProyectoEntity> findByEstudiante(EstudianteEntity estudiante);
	
	List<ProyectoEntity> findByDirector(DirectorEntity director);
	
	List<ProyectoEntity> findByEvaluador(EvaluadorEntity evaluador);
}
