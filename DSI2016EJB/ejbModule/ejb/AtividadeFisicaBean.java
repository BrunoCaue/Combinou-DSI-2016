package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.AtividadeFisica;
import model.Usuario;

/**
 * Session Bean implementation class AtividadeFisicaBean
 */
@Stateless
public class AtividadeFisicaBean implements AtividadeFisicaBeanLocal {
	@PersistenceContext (name = "dsi2016context")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public AtividadeFisicaBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
    @Override
	public void save(AtividadeFisica c) {
		if(em.find(Usuario.class, c.getOid())== null){
			// insert
			em.persist(c);
			
		}else{
			//update
			em.merge(c);
		}
		
	}

	@Override
	public void remove(AtividadeFisica c) {
		// TODO Auto-generated method stub
		em.remove(c);
		
	}

	@Override
	public List<AtividadeFisica> getAll() {
		// TODO Auto-generated method stub
		Query q = em.createNamedQuery("getAtividadeFisica");
		//q.setMaxResults(100); //numero registo
		
		return q.getResultList();
	}

}
