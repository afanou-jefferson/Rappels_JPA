package TP2.entite.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractService {

	@PersistenceContext
	protected EntityManager em;

	public void sauvegarder(Object toSave) {
		this.em.persist(toSave);
	}

	public void merge(Object toSave) {
		this.em.merge(toSave);
	}

	public AbstractService() {
		super();
	}
}
