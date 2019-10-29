package com.demo.SpringSecuritydb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringSecuritydb.model.Student;
import com.demo.SpringSecuritydb.repository.StudentRepository;


@RestController
public class StudentController {

	@Autowired
    private StudentRepository studentRepository;
	
	@RequestMapping("/students")
	public List<Student>getAllStudent(){
		
		return studentRepository.findAll();
		
	}
	
    @RequestMapping(value="/student", method=RequestMethod.POST)  
    public void addStudent(@RequestBody Student student){  
    	studentRepository.save(student);
         
    }
    
    @RequestMapping(value="/student/{id}", method=RequestMethod.GET)  
    public Student getStudent(@PathVariable Long id){  
        return studentRepository.findById(id).get();  
    } 
    
    @RequestMapping(value="/student/{id}", method=RequestMethod.DELETE)
    public void studentDelete(@PathVariable Long id) {
    	studentRepository.deleteById(id);
    }
    
    @RequestMapping(value="/student", method=RequestMethod.PUT)
    public void studentUpdate(@RequestBody Student student){
    	Student stu=studentRepository.getOne(student.getId());
    	stu.setName(student.getName());
    	stu.setEmail(student.getEmail());
    	studentRepository.save(stu);
 
    }

    
}
