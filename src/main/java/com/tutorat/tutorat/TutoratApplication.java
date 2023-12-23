package com.tutorat.tutorat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tutorat.tutorat.entities.Etudiant;
import com.tutorat.tutorat.entities.Tuteur;
import com.tutorat.tutorat.repositories.EtudiantRepository;
import com.tutorat.tutorat.repositories.TuteurRepository;
import com.tutorat.tutorat.services.EtudiantService;

@SpringBootApplication
@ComponentScan(basePackages = "com.tutorat.tutorat")
public class TutoratApplication implements CommandLineRunner {
	
	@Autowired
	private  EtudiantRepository etudiantRepository;
	
	@Autowired
	private TuteurRepository tuteurRepository;

	public static void main(String[] args) {
		SpringApplication.run(TutoratApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*Etudiant etudiant = new Etudiant();
		etudiant.setNom("kawtar");
		etudiant.setPrenom("berrada");
		etudiant.setFliere("genie informatique");
		
		etudiantRepository.save(etudiant);
		
		Tuteur tuteur = new Tuteur();
		tuteur.setNom("mehdi");
		tuteur.setPrenom("tarchoun");
		tuteurRepository.save(tuteur);*/
		/*Etudiant etudiantTest = new Etudiant();
	    etudiantTest.setNom("khardli");
	    etudiantTest.setPrenom("yassine");
	    etudiantTest.setEmail("test@example.com");
	    etudiantTest.setFliere("Informatique");
	    etudiantTest.setNiveau("ginfo");
	    etudiantRepository.save(etudiantTest);
	    
	    Etudiant etudiant2 = new Etudiant();
	    etudiant2.setNom("tarchoun");
	    etudiant2.setPrenom("mehdi");
	    etudiant2.setEmail("test2@example.com");
	    etudiant2.setFliere("Informatique");
	    etudiant2.setNiveau("ginfo");
	    etudiantRepository.save(etudiant2);
	    
	    System.out.println("Avant la suppression :");
	    System.out.println(etudiantTest);
	    System.out.println(etudiant2);

	    // Appeler la méthode deleteEtudiant pour supprimer le premier étudiant
	 etudiantRepository.delete(etudiant2);


	    // Afficher les informations des étudiants après la suppression
	    System.out.println("Après la suppression :");
	    System.out.println("Le premier étudiant a été supprimé de la base de données");
	    System.out.println("Le deuxième étudiant est toujours présent :");
	    System.out.println(etudiant2);*/
		
		
	}

}
