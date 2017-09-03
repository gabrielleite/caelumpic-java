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

	public void adiciona(Foto foto) {
		manager.persist(foto);
	}
	
	public void atualiza(Foto foto) {
		manager.merge(foto);
	}
	
	public void remove(Foto foto) {
		/* O JPA funciona como uma maquina de estados. De acordo com a sua
		 * definicao, nao eh possivel excluir um objeto que tenha sido recuperado em
		 * outra transacao. Por isso, eh necessario recuperar novamente o objeto do BD
		 * e so apos excluir.
		 * 
		 * Mais informacoes no FJ-25.
		 */
		foto = manager.getReference(Foto.class, foto.getId());
		manager.remove(foto);
	}
	
	public Foto buscaPorId(Long id) {
		return manager.find(Foto.class, id);
	}
}
