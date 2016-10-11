package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Comunidades;
import model.Usuario;

@Local
public interface ComunidadesBeanLocal {

	void save(Usuario usuario);
	public void save (Comunidades c);
	public void remove(Comunidades c);
	public List<Comunidades> getAll();

}
