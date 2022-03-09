package tn.esprit.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {	
	public long idStock;
	public int qte;
	public int qteMin;
	public String libelleStock;
	
	@Id
	public long getIdStock() {
		return idStock;
	}
	public void setIdStock(long idStock) {
		this.idStock = idStock;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getQteMin() {
		return qteMin;
	}
	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}
	public String getLibelleStock() {
		return libelleStock;
	}
	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}
	
}
