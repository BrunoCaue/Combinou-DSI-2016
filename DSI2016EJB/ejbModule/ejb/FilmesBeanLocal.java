package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface FilmesBeanLocal {

	void save(Usuario usuario);

}
