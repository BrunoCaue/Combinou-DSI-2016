package ejb;

import java.util.List;

import javax.ejb.Local;

import model.AtividadeFisica;
import model.Usuario;

@Local
public interface UsuarioBeanLocal {
	// interfaces
	public void save (Usuario c);
	public void remove(AtividadeFisica modelfisica);
	public void remove(Usuario c);
	public void save(AtividadeFisica modelfisica);
	public List <Usuario> getUsuarioByNome(String nome);

	public List<Usuario> getAll();

}
