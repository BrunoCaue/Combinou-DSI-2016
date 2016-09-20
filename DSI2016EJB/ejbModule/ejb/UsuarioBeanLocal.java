package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface UsuarioBeanLocal {
	// interfaces
	public void save (Usuario c);
	public void remove(Usuario c);
	public List<Usuario> getAll();

}
