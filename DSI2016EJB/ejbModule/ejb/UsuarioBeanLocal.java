package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface UsuarioBeanLocal {
	public void save (Usuario usuario);

}
