package com.ibrahim.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Collection")
@NamedQueries({
@NamedQuery(name="Employee.findAll",query="SELECT e FROM Employee e"),
@NamedQuery(name="Employee.findByID",query="SELECT e FROM Employee e WHERE e.id=:id"),
@NamedQuery(name="Employee.deleteByID",query="DELETE FROM Employee e.id=:id")
})
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Employee_ID",unique=true)
	private long id;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String firma;
	@Column(name="AddDate",updatable=false)
	private Date addDate;
	@Column(name="UpdateDate")
	private Date updateDate;
	
	@ElementCollection
	@JoinTable(name="Employee_HomeAddress",joinColumns=@JoinColumn(name="Employee_ID"))
	private Set<Address>homeAddress=new HashSet<>();
	
	@ElementCollection
	@JoinTable(name="Employee_OfficeAddress",joinColumns=@JoinColumn(name="Employee_ID"))
	private Set<Address>officeAddress=new HashSet<>();

	
	
	@ElementCollection
	@JoinTable(name="Employee_CarDetail",joinColumns=@JoinColumn(name="Employee_ID"))
	private Set<CarDetail>carDetails=new HashSet<>();


	public Employee() {
		super();
	}

	public Employee(long id, String name, String surname, String firma, Date addDate, Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.firma = firma;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set<Address> getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Set<Address> homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Set<Address> getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Set<Address> officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Set<CarDetail> getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(Set<CarDetail> carDetails) {
		this.carDetails = carDetails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", firma=" + firma + ", addDate="
				+ addDate + ", updateDate=" + updateDate + ", homeAddress=" + homeAddress + ", officeAddress="
				+ officeAddress + ", carDetails=" + carDetails + "]";
	}

	


	
}
