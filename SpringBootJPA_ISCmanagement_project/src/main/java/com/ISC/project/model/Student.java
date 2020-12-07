package com.ISC.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name = "updatedBy")
	private String updatedBy;
	
	@CreatedDate
	@Column(name = "createdDate")
	private Date createdDate;
	
	@LastModifiedDate
	@Column(name = "updatedDate")
	private Date updatedDate;
	
	@Column(nullable = false, length = 50,unique = true)
	private String codeStu;
	
	@Column(nullable = false, length = 50)
	private String firstName;
	
	@Column(nullable = false, length = 50)
	private String lastName;
	
	@Column(nullable = false, length = 100)
	private String addressStu;
	
	@Column(nullable = false, length = 50)
	private String phoneStu;
	
	@Column(length = 100,unique = true)
	private String emailStu;
	
	@Column(nullable = false)
	private TypeStudent typeStu;
	
	@Column(nullable = false, length = 50)
	private Double gpa;
	
	@Column(nullable = false)
	private StatusAc workingStatus;
	
	@Column(nullable = false,columnDefinition = "TEXT")
	private String image;
	
	@Column(length = 1000)
	private String noteStu;

	//mapping to company
	@OneToMany(
	        cascade = CascadeType.ALL
	    )
	    private List<Company> companies = new ArrayList<>();
	
	//mapping to school
		@OneToMany(
		        cascade = CascadeType.ALL
		    )
		    private List<School> school = new ArrayList<>();
	public String getPhoneStu() {
		return phoneStu;
	}

	public void setPhoneStu(String phoneStu) {
		this.phoneStu = phoneStu;
	}

	public String getCodeStu() {
		return codeStu;
	}

	public void setCodeStu(String codeStu) {
		this.codeStu = codeStu;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressStu() {
		return addressStu;
	}

	public void setAddressStu(String addressStu) {
		this.addressStu = addressStu;
	}

	public String getEmailStu() {
		return emailStu;
	}

	public void setEmailStu(String emailStu) {
		this.emailStu = emailStu;
	}

	
	public TypeStudent getTypeStu() {
		return typeStu;
	}

	public void setTypeStu(TypeStudent typeStu) {
		this.typeStu = typeStu;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public StatusAc getWorkingStatus() {
		return workingStatus;
	}

	public void setWorkingStatus(StatusAc workingStatus) {
		this.workingStatus = workingStatus;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNoteStu() {
		return noteStu;
	}

	public void setNoteStu(String noteStu) {
		this.noteStu = noteStu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	

	public Student(Long id, String createdBy, String updatedBy, Date createdDate, Date updatedDate, String codeStu,
			String firstName, String lastName, String addressStu, String phoneStu, String emailStu, TypeStudent typeStu,
			Double gpa, StatusAc workingStatus, String image, String noteStu) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.codeStu = codeStu;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressStu = addressStu;
		this.phoneStu = phoneStu;
		this.emailStu = emailStu;
		this.typeStu = typeStu;
		this.gpa = gpa;
		this.workingStatus = workingStatus;
		this.image = image;
		this.noteStu = noteStu;
	}

	public Student() {
		super();
	}

	public Student(Long id) {
		super();
		this.id = id;
	}
	
	

}
