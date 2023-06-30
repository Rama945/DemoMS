package com.example.ms_gestionCondidat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_gestionCondidat.entities.Candidat;
import com.example.ms_gestionCondidat.service.ICandidatService;

@RestController
@RequestMapping(value = "API/GestionCandidat")
public class CondidatContoller {
	@Autowired
	ICandidatService canService;
	@PostMapping("/AddCandidat")
	public Candidat addCandidat(@RequestBody Candidat c)
	{
		return canService.addCandidat(c);
	}
	
	@GetMapping("/getOne/{id}")
	public Candidat getOne(@PathVariable("id") int id)
	{
		return canService.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<Candidat> getAll(){
		return canService.getCandidats();
	}
	
}
