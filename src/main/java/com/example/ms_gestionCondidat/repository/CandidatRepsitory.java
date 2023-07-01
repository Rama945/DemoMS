package com.example.ms_gestionCondidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_gestionCondidat.entities.Candidat;

@Repository
public interface CandidatRepsitory extends JpaRepository<Candidat, Integer>{

}
