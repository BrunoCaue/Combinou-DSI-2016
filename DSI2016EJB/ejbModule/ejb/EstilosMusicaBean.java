package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.EstilosMusica;
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
	@Override
	public void save(EstilosMusica c) {
		// TODO Auto-generated method stub
		if(em.find(EstilosMusica.class, c.getOid())== null){
			// insert
			em.persist(c);
			
		}else{
			//update
			em.merge(c);
		}
		
	}
	@Override
	public void remove(EstilosMusica c) {
		// TODO Auto-generated method stub
		em.remove(c);
		
	}
	@Override
	public List<EstilosMusica> getAll() {
		// TODO Auto-generated method stub
		Query q = em.createNamedQuery("getAllEstilosMusica");
		//q.setMaxResults(100); //numero registo
		
		return q.getResultList();
	}

}
