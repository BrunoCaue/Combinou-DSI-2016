package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.AtividadeFisica;
import model.Usuario;

/**
 * Session Bean implementation class UsuarioBean
 */
@Stateless
public class UsuarioBean implements UsuarioBeanLocal {
	@PersistenceContext (name = "dsi2016context")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public UsuarioBean() {
    	// codigo da interface de servidor
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Usuario c) {
		if(em.find(Usuario.class, c.getOid())== null){
			// insert
			em.persist(c);
			
		}else{
			//update
			em.merge(c);
		}
		
	}

	@Override
	public void remove(Usuario c) {
		// TODO Auto-generated method stub
		c = em.find(Usuario.class,c.getOid() );
		em.remove(c);
		
	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		Query q = em.createNamedQuery("getAllUsuario");
		//q.setMaxResults(100); //numero registo
		
		return q.getResultList();
	}

	@Override
	public void remove(AtividadeFisica modelfisica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(AtividadeFisica modelfisica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> getUsuarioByNome(String nome) {
		// TODO Auto-generated method stub
		Query q = em.createNamedQuery("getUsuarioByNome");
		q.setParameter("nome", "%"+nome+"%");
		
		
		
		return q.getResultList();
	}
	

}