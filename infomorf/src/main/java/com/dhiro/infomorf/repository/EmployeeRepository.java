package com.dhiro.infomorf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiro.infomorf.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
	
}
