package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface PermissaoUsuarioBeanLocal {

	void save(Usuario usuario);

}
