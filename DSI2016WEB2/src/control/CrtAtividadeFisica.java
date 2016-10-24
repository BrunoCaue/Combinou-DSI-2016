package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.AtividadeFisicaBeanLocal;
import model.AtividadeFisica;

@ManagedBean(name="crtfisica")
@ViewScoped
public class CrtAtividadeFisica {
	@EJB
	private AtividadeFisicaBeanLocal fisicaBean;
	private AtividadeFisica model = new AtividadeFisica();
	private String valorBusca;
	
	public void create(){
		model = new AtividadeFisica();
		
	}
	public void remove(){
		if(model != null)
			fisicaBean.remove(model);
	}
	
	public void save(){
		System.out.println(model.getDescricao());
		fisicaBean.save(model);
	}
	
	public List<AtividadeFisica> getAll(){
		return fisicaBean.getAll();
	}
	public AtividadeFisica getModel(){
		return model;
	}
	public void setModel(AtividadeFisica model){
		this.model = model;
		
	}

}
