package com.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

    // sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
	
}
