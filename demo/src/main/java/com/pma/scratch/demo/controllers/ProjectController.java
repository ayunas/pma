package com.pma.scratch.demo.controllers;

import com.pma.scratch.demo.entities.Employee;
import com.pma.scratch.demo.entities.Project;
import com.pma.scratch.demo.repos.iEmpRepo;
import com.pma.scratch.demo.repos.iProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	iProjectRepo projRepo;

	@Autowired
	iEmpRepo empRepo;

	@GetMapping
	public String showProjects(Model model) {
		System.out.println("hit the /projects endpoint");
		List<Project> projects = projRepo.findAll();
		System.out.println(projects);
		model.addAttribute("projList",projects);
		return "projects";
	}

	@GetMapping("/new")
	public String showProjectForm(Model model) {
		Project project = new Project();
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("proj",project);
		model.addAttribute("empList",employees);
		return "new-project";
	}

	@PostMapping("/save")
	public String persistProject(Model model, Project proj) {
//		Employee emp1 = new Employee("amir","yunas");
//		List<Employee> employees = new ArrayList<>();
//		employees.add(emp1);
//		empRepo.save(emp1);
//		proj.setEmployeeList(employees);
		projRepo.save(proj);

		System.out.println(proj.getEmployeeList().toString());
//
		for(Employee e : proj.getEmployeeList()) {
			e.setProject(proj);
			empRepo.save(e);
		}

		return "redirect:/projects";
	}

//	@PostMapping("/save")
//	public String jrpPersist(Model model, @RequestParam List<Long> employees, Project project) {
//
//	}


}
