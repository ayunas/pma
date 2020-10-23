package com.pma.scratch.demo.controllers;

import com.pma.scratch.demo.dto.ProjectStakes;
import com.pma.scratch.demo.entities.Employee;
import com.pma.scratch.demo.repos.iEmpRepo;
import com.pma.scratch.demo.repos.iStakeHolderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	iStakeHolderRepo stakeHolderRepo;

	@GetMapping
	public String showHome(Model model) {
		List<ProjectStakes> projectStakes = stakeHolderRepo.findStakeholdersOnProjects();
		System.out.println(projectStakes);
		model.addAttribute("projectStakes",projectStakes);
		return "home";
	}

}
