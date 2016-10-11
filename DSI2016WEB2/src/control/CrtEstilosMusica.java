package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.EstilosMusicaBeanLocal;
import model.EstilosMusica;

@ManagedBean(name="crtestilosmusica")
@ViewScoped
public class CrtEstilosMusica {
	@EJB
	private EstilosMusicaBeanLocal estilosmusicaBean;
	private EstilosMusica model = new EstilosMusica();
	
	public void create(){
		model = new EstilosMusica();
		
	}
	public void remove(){
		if(model != null)
			estilosmusicaBean.remove(model);
	}
	
	public void save(){
		System.out.println(model.getType());
		estilosmusicaBean.save(model);
	}
	
	public List<EstilosMusica> getAll(){
		return estilosmusicaBean.getAll();
	}
	public EstilosMusica getModel(){
		return model;
	}
	public void setModel(EstilosMusica model){
		this.model = model;
		
	}

}
