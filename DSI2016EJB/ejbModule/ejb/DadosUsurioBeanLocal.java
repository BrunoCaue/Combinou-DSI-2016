package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface DadosUsurioBeanLocal {

	void save(Usuario usuario);

}
