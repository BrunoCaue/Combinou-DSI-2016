package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AtividadeFisica {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH})
	private Usuario Usuario;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="atividadefisica_oid")
	private List<PrefAtivFisica> colAtividade = new ArrayList<PrefAtivFisica>();
	
	private int futebol;
	private int basquete;
	private int academia;
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	
	
	public int getFutebol() {
		return futebol;
	}
	public void setFutebol(int futebol) {
		this.futebol = futebol;
	}
	public Usuario getUsuario() {
		return Usuario;
	}
	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}
	public int getBasquete() {
		return basquete;
	}
	public void setBasquete(int basquete) {
		this.basquete = basquete;
	}
	public int getAcademia() {
		return academia;
	}
	public void setAcademia(int academia) {
		this.academia = academia;
	}
	
}
