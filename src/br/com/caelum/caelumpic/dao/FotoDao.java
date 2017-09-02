package br.com.caelum.caelumpic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.caelumpic.modelo.Foto;

@Repository
public class FotoDao {
	@PersistenceContext
	private EntityManager manager;
	
	public List<Foto> lista() {
		return manager.createQuery("Select f from Foto as f", Foto.class)
				.getResultList();
	}
}
