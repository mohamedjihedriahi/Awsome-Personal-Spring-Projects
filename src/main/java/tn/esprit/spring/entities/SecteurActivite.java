package tn.esprit.spring.entities;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class SecteurActivite {
	public long idSecteurActivite;
	public String codeSecteurActivite;
	public String libelleSecteurActivite;
	
	@Id
	public long getIdSecteurActivite() {
		return idSecteurActivite;
	}
	public void setIdSecteurActivite(long idSecteurActivite) {
		this.idSecteurActivite = idSecteurActivite;
	}
	public String getCodeSecteurActivite() {
		return codeSecteurActivite;
	}
	public void setCodeSecteurActivite(String codeSecteurActivite) {
		this.codeSecteurActivite = codeSecteurActivite;
	}
	public String getLibelleSecteurActivite() {
		return libelleSecteurActivite;
	}
	public void setLibelleSecteurActivite(String libelleSecteurActivite) {
		this.libelleSecteurActivite = libelleSecteurActivite;
	}
	
}
