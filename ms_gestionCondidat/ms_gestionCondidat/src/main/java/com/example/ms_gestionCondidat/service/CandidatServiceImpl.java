package com.example.ms_gestionCondidat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionCondidat.entities.Candidat;
import com.example.ms_gestionCondidat.repository.CandidatRepsitory;

@Service
public class CandidatServiceImpl  implements ICandidatService{
	@Autowired
	CandidatRepsitory repo;
	@Override
	public Candidat addCandidat(Candidat c) {
		return repo.save(c);
	}

	@Override
	public List<Candidat> getCandidats() {
		return repo.findAll();
	}

	@Override
	public Candidat getById(int id) {
		return repo.findById(id).get();
	}

}
