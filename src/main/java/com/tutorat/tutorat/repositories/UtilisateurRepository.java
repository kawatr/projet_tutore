package com.tutorat.tutorat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tutorat.tutorat.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

	boolean existsByEmail(String email);

}
