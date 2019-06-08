package fr.kalanSow.busobj;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kalan.PROFILUTILISATEUR")
public class ProfilUtilisateur {
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="portail")
	private String portail;
	
	@javax.persistence.Transient
	private List<DroitUtilisateur> droitUtilisateurs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortail() {
		return portail;
	}

	public void setPortail(String portail) {
		this.portail = portail;
	}

	public List<DroitUtilisateur> getDroitUtilisateurs() {
		return droitUtilisateurs;
	}

	public void setDroitUtilisateurs(List<DroitUtilisateur> droitUtilisateurs) {
		this.droitUtilisateurs = droitUtilisateurs;
	}
	
	
	public void deduplicateDroits() {
		
		Map<String, DroitUtilisateur> droits = new HashMap<String, DroitUtilisateur>();
		List<DroitUtilisateur> droitsUNiques = new ArrayList<DroitUtilisateur>();
		if(this.getDroitUtilisateurs() !=null) {
			
			for( DroitUtilisateur  droit : this.getDroitUtilisateurs()) {
				
				if(! droits.containsKey(droit.getName())) {
					
					droitsUNiques.add(droit);
					droits.put(droit.getName(), droit);
				}
			}
			this.setDroitUtilisateurs(droitsUNiques);
		}
	}

}
