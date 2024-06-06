package com.proyectos_uts.app.repository;

import com.proyectos_uts.app.entity.EvaluadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EvaluadorRepository extends JpaRepository<EvaluadorEntity, Long>{
	
	EvaluadorEntity findByCedulaAndContra(Long cedula, String contra);
}
