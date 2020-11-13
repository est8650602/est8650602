package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
import model.Supplier;
public class JPATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPAFirst");
	        EntityManager entityManager = entityManagerFactory.createEntityManager();
	        entityManager.getTransaction().begin();
	        
	       // List<User> result = entityManager.createNamedQuery("Supplier.findAll").getResultList();
	        List<Supplier> result = entityManager.createQuery("SELECT s FROM Supplier s").getResultList();
	        for (Supplier s : result) {
	            System.out.println(s.getSupName());
	        }
	        
	        entityManager.getTransaction().commit();
	        entityManager.close();

	    }

	}
