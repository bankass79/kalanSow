package fr.kalanSow.busobj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="kalan.UTILISATEUR")
public class Utilisateur {
	
	//-------------------Constanates----------------------------------------------
	
	
	//-------------------Proprétés------------------------------------------------
	
	@Id
	@Column(name="matricule")
	private String matricule;

	@Column(name="civilite")
	private String civilite;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "email")
	private String  email;

	@ManyToOne
	@JoinColumn(name = "id_structure")
	private Structure	structure ;

	@ManyToOne
	@JoinColumn(name = "id_profilUtilisateur")
	private ProfilUtilisateur profilUtilisateur ;

	@ManyToOne
	@JoinColumn(name = "id_langue")
	private Langue langue ;
	
	public String getMatricule() {
		return matricule;
	}



	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	public String getCivilite() {
		return civilite;
	}



	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Structure getStructure() {
		return structure;
	}



	public void setStructure(Structure structure) {
		this.structure = structure;
	}



	public ProfilUtilisateur getProfilUtilisateur() {
		return profilUtilisateur;
	}



	public void setProfilUtilisateur(ProfilUtilisateur profilUtilisateur) {
		this.profilUtilisateur = profilUtilisateur;
	}



	public Langue getLangue() {
		return langue;
	}



	public void setLangue(Langue langue) {
		this.langue = langue;
	}



	public boolean equalTo(Utilisateur utilsateur) {
		if(utilsateur==null) {
			
			return false;
		}
		
		;
		// return (this.getId()==utilisateur.getId())
		
		
		return this.getMatricule()==utilsateur.getMatricule();
		
		
	}
}
