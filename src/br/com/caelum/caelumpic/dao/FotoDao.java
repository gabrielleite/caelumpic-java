package br.com.caelum.caelumpic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.caelumpic.modelo.Foto;

/* Anotacao @Repository habilita o dao a ser injetado em outras classes
 * atraves da anotacao @Autowired.
 */
@Repository
public class FotoDao {
	/* Anotacao @PersistenceContext injeta uma instancia de EntityManager.
	 */
	@PersistenceContext
	private EntityManager manager;
	
	public List<Foto> lista() {
		
		/* O segundo parametro Foto.class garante que o retorno eh
		 * referente a essa classe.
		 */
		return manager.createQuery("Select f from Foto as f", Foto.class)
				.getResultList();
	}
}
