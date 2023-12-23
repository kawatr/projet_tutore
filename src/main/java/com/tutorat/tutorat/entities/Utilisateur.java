package com.tutorat.tutorat.entities;
import java.io.Serializable;

//import com.tutorat.tutorat.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Utilisateur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    
//    @Enumerated(EnumType.STRING)
//    private Status status;
    
    
   
	
}
