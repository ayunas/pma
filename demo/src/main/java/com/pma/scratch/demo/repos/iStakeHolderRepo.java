package com.pma.scratch.demo.repos;

import com.pma.scratch.demo.entities.Stakeholder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface iStakeHolderRepo extends CrudRepository<Stakeholder,Long> {

	@Override
	List<Stakeholder> findAll();
}
