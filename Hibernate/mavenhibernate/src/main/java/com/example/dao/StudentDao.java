package com.example.dao;

/*
 *@author Arnab Kumar Hoodati 
 * 
 */

public interface StudentDao {
	public void addStudent();	  //save new student in DB
	public void deleteStudent();  //remove existing student data
	public void updateStudent();  //change existing student data
	public void fetchStudent();	  //fetch existing student data
	
	
	//void addStudent(Student student);
	//void updateStudent(int id,Student student);
	
	//String deleteStudent(int id);
	//Student fetchStudent(int id);

}
