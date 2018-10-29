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
	private SessionFactory sessionFactory;
	
	public Integer saveEmployeeDetails(EmployeeDTO employeeDTO)
	{
		Session session=null;
		Transaction transaction=null;
		Integer identifier=null;
		try {
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();
			identifier=(Integer) session.save(employeeDTO);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null)
			session.close();
		}
		
		
		return identifier;
		
	}
	
	
	

}
