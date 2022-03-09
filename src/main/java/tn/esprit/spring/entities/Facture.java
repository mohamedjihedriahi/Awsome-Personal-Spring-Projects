package tn.esprit.spring.entities;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;

@Entity
@Table( name = "FactureFacture")
public class Facture {
	public long idFacture;
	public float montantRemise;
	public float montantFacture;
	public Date dateCreationFacture;
	public Date dateDerniereModification;
	public boolean archivee;
	
	@Id
	public long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	public float getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}
	@Temporal (TemporalType.DATE)
	public Date getDateCreationFacture() {
		return dateCreationFacture;
	}
	public void setDateCreationFacture(Date dateCreationFacture) {
		this.dateCreationFacture = dateCreationFacture;
	}
	@Temporal (TemporalType.DATE)
	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	public boolean isArchivee() {
		return archivee;
	}
	public void setArchivee(boolean archivee) {
		this.archivee = archivee;
	}
	
	
}
