package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.FilmesBeanLocal;
import model.Filmes;

@ManagedBean(name="crtfilmes")
@ViewScoped
public class CrtFilmes {
	@EJB
	private FilmesBeanLocal filmesBean;
	private Filmes modelfilmes = new Filmes();
	
	public void create(){
		modelfilmes = new Filmes();
		
	}
	public void remove(){
		if(modelfilmes != null)
			filmesBean.remove(modelfilmes);
	}
	
	public void save(){
		System.out.println(modelfilmes.getDescricao());
		filmesBean.save(modelfilmes);
	}
	
	public List<Filmes> getAll(){
		return filmesBean.getAll();
	}
	public Filmes getModel(){
		return modelfilmes;
	}
	public void setModel(Filmes model){
		this.modelfilmes = model;
		
	}

}
