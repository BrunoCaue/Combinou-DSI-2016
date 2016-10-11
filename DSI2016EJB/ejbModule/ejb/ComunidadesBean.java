package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Comunidades;
import model.Usuario;

/**
 * Session Bean implementation class Comunidades
 */
@Stateless
public class ComunidadesBean implements ComunidadesBeanLocal {
	@PersistenceContext (name = "dsi2016context")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public ComunidadesBean() {
        // TODO Auto-generated constructor stub
    }
    @Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
    }
	@Override
	public void save(Comunidades c) {
		// TODO Auto-generated method stub
		if(em.find(Comunidades.class, c.getOid())== null){
			// insert
			em.persist(c);
			
		}else{
			//update
			em.merge(c);
		}
		
	}
	@Override
	public void remove(Comunidades c) {
		// TODO Auto-generated method stub
		em.remove(c);
		
	}
	@Override
	public List<Comunidades> getAll() {
		Query q = em.createNamedQuery("getAllComunidades");
		//q.setMaxResults(100); //numero registo
		
		return q.getResultList();
	}
    
	

}
