package org.zeesense.springmvc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zeesense.springmvc.dto.EmployeeDTO;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory factory;

	public Integer saveEmployeeDetails(EmployeeDTO dto) {
		Session session = null;
		Integer identifier = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			identifier = (Integer) session.save(dto);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return identifier;

	}

}
