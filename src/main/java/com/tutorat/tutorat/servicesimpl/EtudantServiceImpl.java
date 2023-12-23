package com.tutorat.tutorat.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorat.tutorat.entities.Etudiant;
import com.tutorat.tutorat.repositories.EtudiantRepository;
import com.tutorat.tutorat.services.EtudiantService;

@Service
public  class EtudantServiceImpl implements EtudiantService {
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public Etudiant addEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}

	@Override
	public void updateEtudiant(Etudiant etudiant, int id) {
		Etudiant etudiantById = etudiantRepository.findById(id).get();
		etudiantById.setEmail(etudiant.getEmail());
		etudiantRepository.save(etudiantById);
		
	}
	@Override
	public Etudiant getEtudiantById(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }
	@Override
	public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }
	
	
	 

}
