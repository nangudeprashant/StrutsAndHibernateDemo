package com.javaLive.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaLive.databaseUtil.HibernateUtil;
import com.javaLive.entity.Student;

public class StudentDAO {
	@SuppressWarnings({ "unused", "finally" })
	public List getStudentList() {
		Transaction transaction = null;
		List<Student> students = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from Student");// , Student.class).list();
			students = query.list();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			return students;
		}
	}

	@SuppressWarnings("finally")
	public boolean createStudent(Student student) {
		Transaction transaction = null;
		Session session = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.save(student);
			// commit transaction
			transaction.commit();
			result = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			return result;
		}

	}

	@SuppressWarnings("finally")
	public boolean updateStudent(Student student) {
		Transaction transaction = null;
		Session session = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.update(student);
			// commit transaction
			transaction.commit();
			result = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			return result;
		}

	}

	@SuppressWarnings("finally")
	public boolean deleteStudent(Student student) {
		Transaction transaction = null;
		Session session = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.delete(student);
			// commit transaction
			transaction.commit();
			result = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			return result;
		}

	}
}
