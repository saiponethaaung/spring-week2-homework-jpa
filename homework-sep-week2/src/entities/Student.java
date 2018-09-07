package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String gender;
	private LocalDate birthDate;
	private String degree;
	private String address;
	private String mobile;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Semester semester;
	
	@OneToOne(mappedBy="student",cascade=CascadeType.PERSIST)
	private Gpa gpa;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Status status;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Level level;
	
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	
	
	public Student(String firstName, String lastName, String middleName, String gender, LocalDate birthDate,
			String degree, String address, String mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.degree = degree;
		this.address = address;
		this.mobile = mobile;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}   
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}   
	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}   
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}


	public Gpa getGpa() {
		return gpa;
	}


	public void setGpa(Gpa gpa) {
		this.gpa = gpa;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Level getLevel() {
		return level;
	}


	public void setLevel(Level level) {
		this.level = level;
	}
	
   
}
