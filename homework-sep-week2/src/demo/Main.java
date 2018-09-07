package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPU");
		EntityManager em = emf.createEntityManager();
		
		DAOTest obj = new DAOTest(em);
		
		obj.create();
		
		em.close();
		emf.close();
		
		util.JPAUtil.checkData("SELECT * FROM student");
		util.JPAUtil.checkData("SELECT * FROM semester");
		util.JPAUtil.checkData("SELECT * FROM gpa");
		util.JPAUtil.checkData("SELECT * FROM status");
		util.JPAUtil.checkData("SELECT * FROM level");
		util.JPAUtil.checkData("SELECT * FROM grade");
	}

}
