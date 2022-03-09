package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
//@Table( name = "CategorieProduit")
public class CategorieProduit {
	public long idCategorieProduit;
	public String codeProduit;
	public String libelleCategorieProduit;
	@Id
	@Column(name="Id_de_cat_Produit")
	public long getIdCategorieProduit() {
		return idCategorieProduit;
	}
	public void setIdCategorieProduit(long idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	@Transient
	public String getLibelleCategorieProduit() {
		return libelleCategorieProduit;
	}
	public void setLibelleCategorieProduit(String libelleCategorieProduit) {
		this.libelleCategorieProduit = libelleCategorieProduit;
	}
	
}
