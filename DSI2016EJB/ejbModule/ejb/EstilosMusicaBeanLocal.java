package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface EstilosMusicaBeanLocal {

	void save(Usuario usuario);

}
