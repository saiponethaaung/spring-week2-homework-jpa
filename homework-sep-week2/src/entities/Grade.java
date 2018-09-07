package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Grade
 *
 */
@Entity

public class Grade implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String grade;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Student student;

	public Grade() {
		super();
	}
	
	public Grade(String grade) {
		super();
		this.grade = grade;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
   
}
