package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Filmes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	//@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH})
	
	@Column(length=500)
	private String terror;
	@Column(length=500)
	private String drama;
	@Column(length=500)
	private String comedia;
	//private Usuario Usuario;
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="filmes_oid")
	//private List<PrefFilmes> colFilmes; //associação entre filmes e prefFilmes.
	
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getTerror() {
		return terror;
	}
	public void setTerror(String terror) {
		this.terror = terror;
	}
	public String getDrama() {
		return drama;
	}
	public void setDrama(String drama) {
		this.drama = drama;
	}
	public String getComedia() {
		return comedia;
	}
	public void setComedia(String comedia) {
		this.comedia = comedia;
	}

	

}
