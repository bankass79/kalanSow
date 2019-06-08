package fr.kalanSow.busobj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kalan.entite_STRUCTURE")
public class Structure {
	
	//-------------------Constantes---------------------------
	
	//-----------------Propriétés-----------------------------
	
	@Id
	private String name;
	
	@Column(name="id_etablissement")
	private int id_etablissement;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId_etablissement() {
		return id_etablissement;
	}

	public void setId_etablissement(int id_etablissement) {
		this.id_etablissement = id_etablissement;
	}

	public boolean equalsTo(Structure structure) {
		
		if(structure==null) {
			
			return false;
		}
		
		if(this.name==null) {
			
			return false;
		}
		
		return (this.name.equals(structure.name));
	}
	
}
