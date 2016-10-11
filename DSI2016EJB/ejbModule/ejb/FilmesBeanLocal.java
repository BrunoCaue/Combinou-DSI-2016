package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Filmes;
import model.Usuario;

@Local
public interface FilmesBeanLocal {

	void save(Usuario usuario);
	public void save (Filmes a);
	public void remove(Filmes a);
	public List<Filmes> getAll();

}
