package com.tutorat.tutorat.servicesimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



import com.tutorat.tutorat.entities.Admin;
import com.tutorat.tutorat.entities.Etudiant;
import com.tutorat.tutorat.entities.Tuteur;
import com.tutorat.tutorat.entities.Utilisateur;
import com.tutorat.tutorat.repositories.UtilisateurRepository;
import com.tutorat.tutorat.services.AuthService;
import com.tutorat.tutorat.dto.SignupRequest;


@Service
public class AuthServiceIImp implements AuthService {
	
	private final UtilisateurRepository utilisateurRepository;
	private final PasswordEncoder passwordEncoder;
	@Autowired
	public AuthServiceIImp(UtilisateurRepository utilisateurRepository, PasswordEncoder passwordEncoder) {
		super();
		this.utilisateurRepository = utilisateurRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public boolean createUtilisateur(com.tutorat.tutorat.dto.SignupRequest signupRequest) {
		if(utilisateurRepository.existsByEmail(signupRequest.getEmail())) {
			return false;
		}
		Utilisateur utilisateur;
		if (signupRequest.isUserTypeEtudiant()) {
	        utilisateur = new Etudiant();
	    } else if (signupRequest.isUserTypeTuteur()) {
	        utilisateur = new Tuteur();
	    } else {
	        utilisateur = new Admin();
	    }
		
		String hashpassword=passwordEncoder.encode(signupRequest.getMotDePasse());
		utilisateur.setMotDePasse(hashpassword);
		utilisateurRepository.save(utilisateur);
		return true;
	}

}
	


