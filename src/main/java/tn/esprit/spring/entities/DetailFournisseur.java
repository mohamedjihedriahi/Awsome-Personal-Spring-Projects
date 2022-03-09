package tn.esprit.spring.entities;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@Table( name = "Detail_Fournisseur")
public class DetailFournisseur {
	@Id
	@Column(name="IdDetailFournisseur")
	public long idDetailFournisseur;
	@Temporal (TemporalType.DATE)
	public Date dateDebutCollaboration;
	public String adreese;
	public String matricule;
	@OneToOne
	public Fournisseur fournisseur;
	
	//Constructors
	public long getIdDetailFournisseur() {
		return idDetailFournisseur;
	}
	public void setIdDetailFournisseur(long idDetailFournisseur) {
		this.idDetailFournisseur = idDetailFournisseur;
	}
	
	public Date getDateDebutCollaboration() {
		return dateDebutCollaboration;
	}
	public void setDateDebutCollaboration(Date dateDebutCollaboration) {
		this.dateDebutCollaboration = dateDebutCollaboration;
	}
	public String getAdreese() {
		return adreese;
	}
	public void setAdreese(String adreese) {
		this.adreese = adreese;
	}
	@Transient
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
}
