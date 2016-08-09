package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Usuario;

/**
 * Session Bean implementation class FilmesBean
 */
@Stateless
public class FilmesBean implements FilmesBeanLocal {
	@PersistenceContext (name = "dsi2016context")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public FilmesBean() {
        // TODO Auto-generated constructor stub
    }
    @Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
