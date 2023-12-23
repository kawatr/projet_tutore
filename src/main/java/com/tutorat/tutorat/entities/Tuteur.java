package com.tutorat.tutorat.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tuteur extends Utilisateur  {
	
	private String filiere;
	private String module;
	
	@OneToMany(mappedBy = "tuteur")
	private List<Sessiontutorat> sessiontutorats ;

}
