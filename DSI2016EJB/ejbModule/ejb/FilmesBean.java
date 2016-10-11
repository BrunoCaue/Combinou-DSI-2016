package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Filmes;
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
	@Override
	public void save(Filmes a) {
		// TODO Auto-generated method stub
		if(em.find(Filmes.class, a.getOid())== null){
			// insert
			em.persist(a);
			
		}else{
			//update
			em.merge(a);
		}
		
	}
	@Override
	public void remove(Filmes a) {
		// TODO Auto-generated method stub
		em.remove(a);
	}
	@Override
	public List<Filmes> getAll() {
		// TODO Auto-generated method stub
		Query q = em.createNamedQuery("getAllFilmes");
		//q.setMaxResults(100); //numero registo
		
		return q.getResultList();
	}

}
