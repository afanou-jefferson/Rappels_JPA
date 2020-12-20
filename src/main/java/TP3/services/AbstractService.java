package TP3.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractService {

	@PersistenceContext
	protected EntityManager em;

	public AbstractService() {
		super();
	}
}
