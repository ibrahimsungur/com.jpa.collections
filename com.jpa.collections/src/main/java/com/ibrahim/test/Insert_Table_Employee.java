package com.ibrahim.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.ibrahim.model.Address;
import com.ibrahim.model.CarDetail;
import com.ibrahim.model.Employee;
import com.ibrahim.session.JpaEntityManagerFactory;
import com.ibrahim.util.TimeStampFactory;

public class Insert_Table_Employee {

	private static EntityManager entityManager = JpaEntityManagerFactory.buildEntityManager();
	private static EntityTransaction transaction = JpaEntityManagerFactory.transaction();

	public static void main(String[] args) {

		insertTable();

	}

	public static void insertTable() {

		Address homeAddress = new Address("Türkiye", "istanbul", "Fikirtepe", "Erenler Sok.", 34000);
		Address officeAddress = new Address("Türkiye", "istanbul", "Sisli", "Erenler Sok.", 34000);
		CarDetail carDetail = new CarDetail("BMW", "X6", 2009, TimeStampFactory.getCurrentTimeStamp(), null);

		Employee employee = new Employee(0, "ibrahim", "sungur", "Java Yazilim", TimeStampFactory.getCurrentTimeStamp(),
				null);

		employee.getHomeAddress().add(homeAddress);
		employee.getOfficeAddress().add(officeAddress);
		employee.getCarDetails().add(carDetail);

		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();

	}

}
