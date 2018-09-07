package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Gpa
 *
 */
@Entity

public class Gpa implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String gpaCalculated;
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Student student;

	public Gpa() {
		super();
	}   
	
	public Gpa(String gpaCalculated) {
		super();
		this.gpaCalculated = gpaCalculated;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getGpaCalculated() {
		return this.gpaCalculated;
	}

	public void setGpaCalculated(String gpaCalculated) {
		this.gpaCalculated = gpaCalculated;
	}
   
}
