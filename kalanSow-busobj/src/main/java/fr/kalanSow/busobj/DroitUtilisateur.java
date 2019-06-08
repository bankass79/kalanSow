package fr.kalanSow.busobj;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kalan.DROITUTILISATEUR")
public class DroitUtilisateur  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="block")
	private String bloack;
	
	@Column(name="comment")
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloack() {
		return bloack;
	}

	public void setBloack(String bloack) {
		this.bloack = bloack;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
