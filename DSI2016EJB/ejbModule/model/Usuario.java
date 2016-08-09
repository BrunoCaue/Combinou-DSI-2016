package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	@Column(length=500)
	private String nome;
	@Column(length=20)
	private int telefone;
	@Column(length=500)
	private String email;
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	private AtividadeFisica minhaAtividade;// nome da classe atividade fisica
	
	@ManyToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	private List<EstilosMusica> meusEstilos = new ArrayList<EstilosMusica>();
	
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	private Filmes minhafilmes;
	
	
	public EstilosMusica getMinhaMusica() {
		return minhaMusica;
	}
	public void setMinhaMusica(EstilosMusica minhaMusica) {
		this.minhaMusica = minhaMusica;
	}
	public AtividadeFisica getMinhaAtividade() {
		return minhaAtividade;
	}
	public void setMinhaAtividade(AtividadeFisica minhaAtividade) {
		this.minhaAtividade = minhaAtividade;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
