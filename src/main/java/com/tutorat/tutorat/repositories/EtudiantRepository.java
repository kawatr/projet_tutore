package com.tutorat.tutorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tutorat.tutorat.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
	
	

}
