package tn.esprit.spring.entities;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Operateur {
	public long idOperateur;
	public String nom;
	public String prenom;
	public String password;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getIdOperateur() {
		return idOperateur;
	}
	public void setIdOperateur(long idOperateur) {
		this.idOperateur = idOperateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
