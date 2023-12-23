package com.tutorat.tutorat.entities;

import java.io.Serializable; 
import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sessiontutorat implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom,description;
	private  Date date_creation;
	private Date session_date_planifiée;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "tuteur_id")
	private Tuteur tuteur;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "etudiant_sessiontutorat" , joinColumns = @JoinColumn (name = "etudiant_id"), inverseJoinColumns = @JoinColumn(name = "sessiontutorat_id") )
	private List<Etudiant> etudiants;
	

	

}
