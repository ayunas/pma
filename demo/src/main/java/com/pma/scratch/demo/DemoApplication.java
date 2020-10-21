package com.pma.scratch.demo;

import com.pma.scratch.demo.entities.Employee;
import com.pma.scratch.demo.entities.Project;
import com.pma.scratch.demo.entities.Stakeholder;
import com.pma.scratch.demo.repos.iEmpRepo;
import com.pma.scratch.demo.repos.iProjectRepo;
import com.pma.scratch.demo.repos.iStakeHolderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	iStakeHolderRepo stakeRepo;

	@Autowired
	iProjectRepo projRepo;

	@Autowired
	iEmpRepo empRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello PMA again");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			Employee emp1 = new Employee("john","Heinz");
			Employee emp2 = new Employee("Jimmy","Fowler");
			Employee emp3 = new Employee("marisa","gonzalez");
			Employee emp4 = new Employee("Danielle","Horne");
			Employee emp5 = new Employee("George","Torres");
			Employee emp6 = new Employee("Mathew","Choat");
			Employee emp7 = new Employee("Justin","Cheng");

			Project proj1 = new Project("spring","in progress","boot strapping the spring ecosystem");
			Project proj2 = new Project("react","completed","react is awesome");
			Project proj3 = new Project("mysql","in progress","still working on the solidifying SQL though I know the basics");

			Stakeholder sh1 = new Stakeholder("abram","jablonsky","AppDev manager");
			Stakeholder sh2 = new Stakeholder("lois","lane","innocent bystander");
			Stakeholder sh3 = new Stakeholder("judge","judy","user");

			proj1.setEmployeeList(Arrays.asList(emp1,emp2,emp3));
			proj2.setEmployeeList(Arrays.asList(emp4,emp5));
			proj3.setEmployeeList(Arrays.asList(emp6));
			proj3.setEmployeeList(Arrays.asList(emp7));

			proj1.setStakeholderList(Arrays.asList(sh1,sh2));
			proj2.setStakeholderList(Arrays.asList(sh3));
			proj3.setStakeholderList(Arrays.asList(sh1,sh2,sh3));

			List<Stakeholder> shes = Arrays.asList(sh1,sh2,sh3);
			shes.forEach(sh -> stakeRepo.save(sh));


			List<Employee> employees = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
			employees.forEach(emp -> empRepo.save(emp));

			List<Project> projects = Arrays.asList(proj1,proj2,proj3);
			projects.forEach(proj -> projRepo.save(proj));

		};
	}

}
