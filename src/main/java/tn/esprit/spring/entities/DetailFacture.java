package tn.esprit.spring.entities;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DetailFacture {
	public long idDetailFacture;
	public int qteCommandes;
	public float prixTotalDetail;
	public int pourcentageRemise;
	public float montantRemise;
	
	@Id
	@Column(name="IdDetailFacture")
	public long getIdDetailFacture() {
		return idDetailFacture;
	}
	public void setIdDetailFacture(long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}
	public int getQteCommandes() {
		return qteCommandes;
	}
	public void setQteCommandes(int qteCommandes) {
		this.qteCommandes = qteCommandes;
	}
	public float getPrixTotalDetail() {
		return prixTotalDetail;
	}
	public void setPrixTotalDetail(float prixTotalDetail) {
		this.prixTotalDetail = prixTotalDetail;
	}
	public int getPourcentageRemise() {
		return pourcentageRemise;
	}
	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}
	@Transient
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	
}
