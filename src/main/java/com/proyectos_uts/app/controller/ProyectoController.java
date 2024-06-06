package com.proyectos_uts.app.controller;

import java.util.List;
import java.util.Optional;

import com.proyectos_uts.app.entity.DirectorEntity;
import com.proyectos_uts.app.entity.EstudianteEntity;
import com.proyectos_uts.app.entity.EvaluadorEntity;
import com.proyectos_uts.app.entity.ProyectoEntity;
import com.proyectos_uts.app.repository.DirectorRepository;
import com.proyectos_uts.app.repository.EstudianteRepository;
import com.proyectos_uts.app.repository.EvaluadorRepository;
import com.proyectos_uts.app.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ProyectoController {
	
	@Autowired
	private ProyectoRepository proyectoRepository;
	
	@Autowired
	private DirectorRepository directorRepository;
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Autowired
	private EvaluadorRepository evaluadorRepository;
	
	@GetMapping("/listar-proy")
	public String listar(Model model) {
		List<ProyectoEntity> listar = proyectoRepository.findAll();
		
		model.addAttribute("listarProy", listar);
		
		return "listarProy";
	}
	
	@GetMapping("/listar-proy-est/{id}")
	public String listarPEst(Model model, @PathVariable Long id) {
		List<ProyectoEntity> listar = proyectoRepository.findAll();
		
		model.addAttribute("listarProy", listar);
		model.addAttribute("id", id);
		
		return "listarProyEst";
	}
	
	@GetMapping("/listar-proy-estu/{id}")
	public String listarPEstu(Model model, @PathVariable Long id) {
		EstudianteEntity entity = estudianteRepository.findById(id).get();
		List<ProyectoEntity> listar = proyectoRepository.findByEstudiante(entity);
		
		model.addAttribute("listarProy", listar);
		model.addAttribute("id", id);
		
		return "listarProyEst";
	}
	
	@GetMapping("/seleccionar/{id}/{idEst}")
	public String seleccinar(@PathVariable Long id, @PathVariable Long idEst) {
		ProyectoEntity proyectoEntity = proyectoRepository.findById(id).get();
		
		proyectoEntity.setEstudiante(estudianteRepository.findById(idEst).get());
		
		proyectoRepository.save(proyectoEntity);
		
		return  "redirect:/home-est/" + idEst;
	}
	
	@GetMapping("/listar-proy-dir/{id}")
	public String listarProyDir(Model model, @PathVariable Long id) {
		DirectorEntity directorEntity = directorRepository.findById(id).get();
		
		List<ProyectoEntity> listar = proyectoRepository.findByDirector(directorEntity);
		
		model.addAttribute("listarProy", listar);
		
		return "listarProy";
	}
	
	@GetMapping("/listar-proy-eva/{id}")
	public String listarProyEva(Model model, @PathVariable Long id) {
		EvaluadorEntity evaluadorEntity = evaluadorRepository.findById(id).get();
		
		List<ProyectoEntity> listar = proyectoRepository.findByEvaluador(evaluadorEntity);
		
		model.addAttribute("listarProy", listar);
		
		return "listarProy";
	}
	
	@GetMapping("/crearProy")
	public String crear(Model model) {
		model.addAttribute("proy", new ProyectoEntity());
		model.addAttribute("listaDir", directorRepository.findAll());
		model.addAttribute("listaEst", estudianteRepository.findAll());
		model.addAttribute("listaEva", evaluadorRepository.findAll());
		
		return "formProy";
	}
	
	@PostMapping("/guardarProy")
	public String guardar(ProyectoEntity proy) {
		proyectoRepository.save(proy);
		
		return "redirect:/listar-proy";
	}
	
	@GetMapping("/editarProy/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Optional<ProyectoEntity> optionalProyecto = proyectoRepository.findById(id);
		if (optionalProyecto.isPresent()) {
		    ProyectoEntity proyecto = optionalProyecto.get();
		    // Resto del código
		    model.addAttribute("proy", proyecto);
		    model.addAttribute("listaDir", directorRepository.findAll());
			model.addAttribute("listaEst", estudianteRepository.findAll());
			model.addAttribute("listaEva", evaluadorRepository.findAll());
		}
		
		return "formProy";
	}
	
	@GetMapping("/eliminarProy/{id}")
	public String eliminar(@PathVariable Long id, Model model) {
		proyectoRepository.deleteById(id);
		
		return "redirect:/listar-proy";
	}

}
