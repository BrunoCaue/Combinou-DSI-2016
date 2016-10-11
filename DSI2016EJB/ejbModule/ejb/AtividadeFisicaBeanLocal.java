package ejb;

import java.util.List;

import javax.ejb.Local;

import model.AtividadeFisica;
import model.Usuario;

@Local
public interface AtividadeFisicaBeanLocal {

	void save(Usuario usuario);

	void remove(AtividadeFisica c);

	List<AtividadeFisica> getAll();

	void save(AtividadeFisica c);

}
