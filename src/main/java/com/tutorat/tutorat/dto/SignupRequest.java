package com.tutorat.tutorat.dto;

public class SignupRequest {
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private Object userType;
	public boolean isUserTypeEtudiant() {
		return "Etudiant".equals(this.userType);
	}
	public boolean isUserTypeTuteur() {
		return "Tuteur".equals(this.userType);
	}
	
}
