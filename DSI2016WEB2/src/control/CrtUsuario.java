package control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
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
	private String valorBusca;
	private List <Usuario> colUsuario = new ArrayList<Usuario>();
	
	@PostConstruct
	public void init(){
		colUsuario = usuarioBean.getAll();
	}
	
	
	
	public List<Usuario> getColUsuario() {
		return colUsuario;
	}
	public void setColUsuario(List<Usuario> colUsuario) {
		this.colUsuario = colUsuario;
	}
	public String getValorBusca() {
		return valorBusca;
	}
	public void setValorBusca(String valorBusca) {
		this.valorBusca = valorBusca;
	}
	public void create(){
		model = new Usuario();
		
	}
	public void remove(){
			usuarioBean.remove(model);
			init();
	}
	
	public UsuarioBeanLocal getUsuarioBean() {
		return usuarioBean;
	}
	public void setUsuarioBean(UsuarioBeanLocal usuarioBean) {
		this.usuarioBean = usuarioBean;
	}
	public void save(){
		System.out.println(model.getNome());
		usuarioBean.save(model);
		init();
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
	public void busca(){
		colUsuario = usuarioBean.getUsuarioByNome(valorBusca);
		System.out.println("porque voce nao passa laaaaaaaaaaaaa....");
	}

}
