package org.zeesense.springmvc.dao;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

	public boolean updateEmployeeDetails(EmployeeDTO dto) {
		boolean status = false;
		Transaction transaction = null;
		Query query = null;
		try (Session session = factory.openSession()) {
			// factory.getCurrentSession();//to call the current session which is already
			// running
			transaction = session.beginTransaction();

			String fetchQry = "select emp from EmployeeDTO emp where name=:name ";//name should be entered same as database
			query = session.createQuery(fetchQry);
			query.setParameter("name", dto.getName());
			EmployeeDTO employeeDTO = (EmployeeDTO) query.uniqueResult();

			if (dto != null && employeeDTO != null)

				employeeDTO.setAge(dto.getAge());
			employeeDTO.setAlternateEmail(dto.getAlternateEmail());
			employeeDTO.setAlternatePhone(dto.getAlternatePhone());
			employeeDTO.setDob(dto.getDob());
			employeeDTO.setGender(dto.getGender());
			employeeDTO.setLocation(dto.getLocation());
			employeeDTO.setName(dto.getName());
			employeeDTO.setPassword(dto.getPassword());
			employeeDTO.setPhoneNumber(dto.getPhoneNumber());

			session.update(employeeDTO);

			transaction.commit();
			// session.getTransaction().begin();//no need to create the Transaction
			// Interface
			session.close();
			return status = true;
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return status;
		}
	}

	public Integer deleteEmployeeDetails(int id) {
		
		
		String delQuery = "delete from EmployeeDTO where id=" + id;
		Integer result = null;
		Transaction transaction=null;
		try(Session session = factory.openSession()){
			//factory.getCurrentSession().beginTransaction();
			
			transaction= session.beginTransaction();
			Query query = session.createQuery(delQuery);
			result = query.executeUpdate();
			transaction.commit();
			//factory.getCurrentSession().close();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return result;
	}

}
