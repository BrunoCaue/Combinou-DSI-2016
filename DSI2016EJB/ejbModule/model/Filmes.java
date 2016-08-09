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
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH})
	
	
	private int terror;
	private int drama;
	private int comedia;
	private Usuario Usuario;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="filmes_oid")
	private List<PrefFilmes> colFilmes; //associação entre filmes e prefFilmes.
	
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public List<PrefFilmes> getColFilmes() {
		return colFilmes;
	}
	public void setColFilmes(List<PrefFilmes> colFilmes) {
		this.colFilmes = colFilmes;
	}

	
	public int getTerror() {
		return terror;
	}
	public void setTerror(int terror) {
		this.terror = terror;
	}
	public int getDrama() {
		return drama;
	}
	public void setDrama(int drama) {
		this.drama = drama;
	}
	public int getComedia() {
		return comedia;
	}
	public void setComedia(int comedia) {
		this.comedia = comedia;
	}
	

}
