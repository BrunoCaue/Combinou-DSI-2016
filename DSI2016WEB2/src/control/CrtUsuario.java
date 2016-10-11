package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.UsuarioBeanLocal;
import model.Usuario;

@ManagedBean(name="crtusuario")
@ViewScoped
public class CrtUsuario {
	@EJB
	private UsuarioBeanLocal usuarioBean;
	private Usuario model = new Usuario();
	
	public void create(){
		model = new Usuario();
		
	}
	public void remove(){
		if(model != null)
			usuarioBean.remove(model);
	}
	
	public void save(){
		System.out.println(model.getNome());
		usuarioBean.save(model);
	}
	
	public List<Usuario> getAll(){
		return usuarioBean.getAll();
	}
	public Usuario getModel(){
		return model;
	}
	public void setModel(Usuario model){
		this.model = model;
		
	}

}
