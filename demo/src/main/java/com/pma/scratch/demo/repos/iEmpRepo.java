package com.pma.scratch.demo.repos;

import com.pma.scratch.demo.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface iEmpRepo extends CrudRepository<Employee,Long> {

	@Override
	List<Employee> findAll();
}