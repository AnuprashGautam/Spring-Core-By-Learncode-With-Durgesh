package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	@Bean 
	public Samosa getSamosa() {
		// Creating new samosa object.
		
		Samosa samosa=new Samosa();
		return samosa;
	}
	
	@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		// Creating new student object.
		
		Student student = new Student(getSamosa());
		return student;
	}

}
