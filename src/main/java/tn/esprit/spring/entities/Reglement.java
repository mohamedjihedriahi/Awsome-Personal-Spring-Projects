package tn.esprit.spring.entities;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@SpringBootApplication
//public class SpringProjectDsApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(SpringProjectDsApplication.class, args);
	}*/
@Entity
public class Reglement {
	public long idReglement;
	public float montantPaye;
	public float montantRestant;
	public boolean payee;
	public Date dateReglement;
	
	@Id
	public long getIdReglement() {
		return idReglement;
	}
	public void setIdReglement(long idReglement) {
		this.idReglement = idReglement;
	}
	public float getMontantPaye() {
		return montantPaye;
	}
	public void setMontantPaye(float montantPaye) {
		this.montantPaye = montantPaye;
	}
	public float getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(float montantRestant) {
		this.montantRestant = montantRestant;
	}
	public boolean isPayee() {
		return payee;
	}
	public void setPayee(boolean payee) {
		this.payee = payee;
	}
	@Temporal (TemporalType.DATE)
	public Date getDateReglement() {
		return dateReglement;
	}
	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}
	
}

//}
