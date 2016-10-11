package ejb;

import java.util.List;

import javax.ejb.Local;

import model.EstilosMusica;
import model.Usuario;

@Local
public interface EstilosMusicaBeanLocal {

	void save(Usuario usuario);
	public void save (EstilosMusica c);
	public void remove(EstilosMusica c);
	public List<EstilosMusica> getAll();
}
