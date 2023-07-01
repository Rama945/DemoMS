package com.example.ms_gestionCondidat.service;

import java.util.List;

import com.example.ms_gestionCondidat.entities.Candidat;

public interface ICandidatService {
	public Candidat addCandidat(Candidat c);
	public List<Candidat> getCandidats ();
	public Candidat getById(int Id);
}
