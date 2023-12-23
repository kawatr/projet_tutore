package com.tutorat.tutorat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorat.tutorat.dto.SignupRequest;
import com.tutorat.tutorat.services.AuthService;

@RestController
@RequestMapping("/signup")
public class SignupController {
	private final AuthService authService;
	@Autowired
	public SignupController(AuthService authService) {
		this.authService=authService;
	}
	@PostMapping
	public ResponseEntity<String> signupUtilisateur(@RequestBody SignupRequest signupRequest){
    boolean isUserCreated=authService.createUtilisateur(signupRequest);
    if(isUserCreated) {
    	 System.out.println("User created successfully");
         return ResponseEntity.status(HttpStatus.CREATED).body("Utilisateur CREE AVEC SUCCES");
    }
    else {
    	System.out.println("User not created");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Utilisateur NON CREE");
	}
    
	}
	
	

}
