package com.uc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uc.entity.RegistrationEntity;

@Repository
@Transactional(value="txManager")
public class RegistrationdaoImpl implements RegistrationDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public RegistrationEntity saveRegistrationDetail(RegistrationEntity rentity) throws Exception {

		try {
			em.persist(rentity);
		} catch (Exception e) {
			throw e;
		}
		
		return rentity;
	}

}
