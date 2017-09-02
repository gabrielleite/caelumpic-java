package br.com.caelum.caelumpic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.caelumpic.modelo.Foto;

/* Anotação @Repository habilita o dao a ser injetado em outras classes
 * através da anotação @Autowired.
 */
@Repository
public class FotoDao {
	/* Anotação @PersistenceContext injeta uma instância de EntityManager.
	 */
	@PersistenceContext
	private EntityManager manager;
	
	public List<Foto> lista() {
		
		/* O segundo parâmetro Foto.class garante que o retorno é
		 * referente a essa classe.
		 */
		return manager.createQuery("Select f from Foto as f", Foto.class)
				.getResultList();
	}
}
