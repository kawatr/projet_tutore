package com.tutorat.tutorat.services;

import org.springframework.stereotype.Service;


import com.tutorat.tutorat.entities.Etudiant;

@Service

public interface EtudiantService {
	
	public Etudiant addEtudiant(Etudiant etudiant);
	
	public void updateEtudiant(Etudiant etudiant, int id);
	
	public Etudiant getEtudiantById(int id);
	
	public void deleteEtudiant(int id);
	
	
}
