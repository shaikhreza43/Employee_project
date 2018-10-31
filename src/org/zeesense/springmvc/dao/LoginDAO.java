package org.zeesense.springmvc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zeesense.springmvc.dto.EmployeeDTO;
import org.zeesense.springmvc.dto.LoginDTO;

@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public EmployeeDTO fetchLoginDetails(String email, String userName) {

		Session session = null;

		EmployeeDTO employeeDTO = null;
		try {
			session = sessionFactory.openSession();
			System.out.println(email);
			System.out.println(userName);
			Query query = null;
			if (email != null && email.length() > 0) {
				String fetchQry = "select emp from EmployeeDTO emp where emp.email=:email ";
				query = session.createQuery(fetchQry);
				query.setParameter("email", email);
			} else {
				String fetchQry = "select emp from EmployeeDTO emp where emp.name=:userName";
				query = session.createQuery(fetchQry);
				query.setParameter("userName", userName);
			}
			employeeDTO = (EmployeeDTO) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return employeeDTO;
	}

}
