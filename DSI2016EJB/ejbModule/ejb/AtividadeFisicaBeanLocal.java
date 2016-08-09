package ejb;

import javax.ejb.Local;

import model.Usuario;

@Local
public interface AtividadeFisicaBeanLocal {

	void save(Usuario usuario);

}
