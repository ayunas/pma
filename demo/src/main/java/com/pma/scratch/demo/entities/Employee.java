package com.pma.scratch.demo.entities;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;

	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name="project_id")
	private Project project;

	public Employee() {}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
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

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
