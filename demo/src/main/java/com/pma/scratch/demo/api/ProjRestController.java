package com.pma.scratch.demo.api;

import com.pma.scratch.demo.entities.Employee;
import com.pma.scratch.demo.entities.Project;
import com.pma.scratch.demo.repos.iProjectRepo;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
public class ProjRestController {

	@Autowired
	iProjectRepo projectRepo;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Project> getProjects() {
		return projectRepo.findAll();
	}

	@GetMapping(path="/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Project getAProject(@PathVariable("id") long id) {
		try {
			return projectRepo.findById(id).get();
		} catch(NoSuchElementException nsee) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Project not found", nsee);
		}
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Project postProject(@RequestBody Project proj) {
		System.out.println("in the post project method");
		try {
			return projectRepo.save(proj);
		} catch(DataIntegrityViolationException dve) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"project name already exists",dve);
		}

	}




}
