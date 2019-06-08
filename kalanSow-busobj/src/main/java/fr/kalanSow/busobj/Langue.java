package fr.kalanSow.busobj;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="kalan.LANGUE")
public class Langue {
	// ------------------------ Constantes ---------------------

	// ------------------------ Proprietes ---------------------
	@Id
	@Column(name="charset")
	private String charset;
	    
	@Column(name = "label")
	private String label;

	// ------------------------ Constructeurs ------------------
	public Langue() {}

	public Langue(String charset) {
		this.charset = charset ;
	}
	
	// ------------------------ Accesseurs ---------------------
	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	// ------------------------ Methodes -----------------------
	@Transient
	@JsonIgnore
	public String getLocaleCode() {
		return charset.replace("-",  "_") ;
	}
	@Transient
	@JsonIgnore
	public void setLocaleCode(String localCode) {
		return ;
	}
	@Transient
	@JsonIgnore
	public Locale getLocale() {
		return Locale.forLanguageTag(charset) ;
	}
}
