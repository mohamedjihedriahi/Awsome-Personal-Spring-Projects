package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;

@Service
public class FournisseurServiceImpl implements IFournisseurService {
	@Autowired
	FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> retrieveAllFournisseur() {
		// TODO Auto-generated method stub
		Fournisseur fournisseur fournisseurRepository.findById(id)
		return fournisseur;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return fournisseurRepository.save(f);
	}

	@Override
	public void deleteFournisseur(Long id) {
		// TODO Auto-generated method stub
		fournisseurRepository.deleteById(id);
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return fournisseurRepository.save(f);
	}

	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		// TODO Auto-generated method stub
		return fournisseurRepository.findById(id).orElse(null);
	}

	
}
