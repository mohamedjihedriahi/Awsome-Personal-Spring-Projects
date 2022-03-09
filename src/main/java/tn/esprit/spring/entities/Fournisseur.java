package tn.esprit.spring.entities;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable {
	public long idFournisseur;
	public String codeFournisseur;
	public String libelleFournisseur;
	@Enumerated(EnumType.STRING)
	private CategorieFournisseur categorieFournisseur;
	@OneToOne(mappedBy="fournisseur")
	public DetailFournisseur detailFournisseur;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCodeFournisseur() {
		return codeFournisseur;
	}
	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}
	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}
	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}
	public CategorieFournisseur getCategorieFournisseur() {
		return categorieFournisseur;
	}
	public void setCategorieFournisseur(CategorieFournisseur categorieFournisseur) {
		this.categorieFournisseur = categorieFournisseur;
	}
	
}
