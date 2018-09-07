package demo;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import entities.Gpa;
import entities.Grade;
import entities.Level;
import entities.Semester;
import entities.Status;
import entities.Student;

public class DAOTest {
	
	private EntityManager em;
	
	public DAOTest(EntityManager em) {
		this.em = em;
	}
	
	public void create() {
		
		Student student1 = new Student("Sai", "Aung", "Pone Tha", "male", LocalDate.of(1995, 2, 21), "CS", "No(8), Sin Win Street, Ahlone Tsp", "09401526924");
		Gpa gpa1 = new Gpa("Calculated value");
		Semester semester1 = new Semester("Semester One");
		Status status1 = new Status("Active");
		Level level1 = new Level("Level One");
		Grade grade1 = new Grade("A");
		student1.setSemester(semester1);
		gpa1.setStudent(student1);
		student1.setGpa(gpa1);
		student1.setStatus(status1);
		student1.setLevel(level1);
		grade1.setStudent(student1);
		
		em.getTransaction().begin();
		
		em.persist(student1);
		em.persist(grade1);
		
		em.getTransaction().commit();
		
	}
	
}
