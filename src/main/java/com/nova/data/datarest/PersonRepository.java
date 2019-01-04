package com.nova.data.datarest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends CrudRepository<Person, String>{
	
	List<Person> findByName(@Param("name") String name);

}
