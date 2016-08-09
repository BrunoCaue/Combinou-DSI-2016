package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	//@ManyToOne(cascade={CascadeType.MERGE, CascadeType.REFRESH})
	//private Usuario Usuario;
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="atividadefisica_oid")
	//private List<PrefAtivFisica> colAtividade = new ArrayList<PrefAtivFisica>();
	@Column(length=500)
	private String Descricao;
	
	
	public String getDescricao() {
		return Descricao;
	}


	public void setDescricao(String descricao) {
		Descricao = descricao;
	}


	public void setOid(long oid) {
		this.oid = oid;
	}


	public long getOid() {
		return oid;
	}

	
	

	
}
