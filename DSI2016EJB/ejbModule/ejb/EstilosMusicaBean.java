package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Usuario;

/**
 * Session Bean implementation class EstiloMusica
 */
@Stateless
public class EstilosMusicaBean implements EstilosMusicaBeanLocal {
	@PersistenceContext (name = "dsi2016context")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public EstilosMusicaBean() {
        // TODO Auto-generated constructor stub
    }
    @Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
