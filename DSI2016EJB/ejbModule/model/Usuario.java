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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name="getAllUsuario",
			query="select c from Usuario c"),
	
	// pra fazer o busca
		@NamedQuery(name="getUsuarioByNome",
				query="select c from Usuario c where c.nome like :nome"),
		
	
})
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	@Column(length=500)
	private String nome;
	@Column(length=20)
	private String telefone;
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Column(length=2000)
	private String endereco;
	@Column(length=500)
	private String email;
	//@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	//private AtividadeFisica minhaAtividade;// nome da classe atividade fisica
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@ManyToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	private List<EstilosMusica> meusEstilos = new ArrayList<EstilosMusica>();
	
	@ManyToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	private List<AtividadeFisica> minhasAtividades = new ArrayList<AtividadeFisica>();
	
	
	@ManyToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	private List<Filmes> meusFilmes = new ArrayList<Filmes>();
	//@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	//private Filmes minhafilmes;
	
	
	
	public List<EstilosMusica> getMeusEstilos() {
		return meusEstilos;
	}
	public void setMeusEstilos(List<EstilosMusica> meusEstilos) {
		this.meusEstilos = meusEstilos;
	}
	public List<AtividadeFisica> getMinhasAtividades() {
		return minhasAtividades;
	}
	public void setMinhasAtividades(List<AtividadeFisica> minhasAtividades) {
		this.minhasAtividades = minhasAtividades;
	}
	public List<Filmes> getMeusFilmes() {
		return meusFilmes;
	}
	public void setMeusFilmes(List<Filmes> meusFilmes) {
		this.meusFilmes = meusFilmes;
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
	
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
