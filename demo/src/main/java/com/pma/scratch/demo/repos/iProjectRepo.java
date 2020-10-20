package com.pma.scratch.demo.repos;

import com.pma.scratch.demo.entities.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iProjectRepo extends CrudRepository<Project,Long> {

	@Override
	List<Project> findAll();

}
