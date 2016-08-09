package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface ComunidadesBeanLocal {

	void save(Usuario usuario);

}
