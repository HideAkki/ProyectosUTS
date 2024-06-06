package com.proyectos_uts.app.repository;

import com.proyectos_uts.app.entity.AdministradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorEntity, Long>{

	AdministradorEntity findByUsuarioAndContra(String usuario, String contra);
}
