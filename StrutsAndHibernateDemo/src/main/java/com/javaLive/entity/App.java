package com.javaLive.entity;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaLive.dao.StudentDAO;
import com.javaLive.databaseUtil.*;

public class App {
    public static void main(String[] args) {
        //Student student = new Student(67,"Name67", "Address67");
        //Student student1 = new Student(68,"Name68", "Address68");
        Transaction transaction = null;
        /*try  {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(student);
            session.save(student1);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }*/ 
        Student s=new Student();
        s.setId(61);
        s.setName("");
        s.setAddress("");
        if(new StudentDAO().deleteStudent(s)) {
        	System.out.println("Student object deleted successfully!!!!!!");
        }
        
        try  {
        	
            List < Student > students = new StudentDAO().getStudentList();
			for(Student s1:students){
				System.out.println(s1.toString());
			};
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}