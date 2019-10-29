package com.demo.SpringSecuritydb.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringSecuritydb.model.Student;




 
public interface StudentRepository extends JpaRepository<Student, Long> {  
	
} 