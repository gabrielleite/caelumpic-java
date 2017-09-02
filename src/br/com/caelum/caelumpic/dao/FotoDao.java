package br.com.caelum.caelumpic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.caelumpic.modelo.Foto;

/* Anota��o @Repository habilita o dao a ser injetado em outras classes
 * atrav�s da anota��o @Autowired.
 */
@Repository
public class FotoDao {
	/* Anota��o @PersistenceContext injeta uma inst�ncia de EntityManager.
	 */
	@PersistenceContext
	private EntityManager manager;
	
	public List<Foto> lista() {
		
		/* O segundo par�metro Foto.class garante que o retorno �
		 * referente a essa classe.
		 */
		return manager.createQuery("Select f from Foto as f", Foto.class)
				.getResultList();
	}
}
