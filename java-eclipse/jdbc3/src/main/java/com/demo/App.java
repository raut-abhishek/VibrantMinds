package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
//    	Student s = new Student();
//    	s.setName("Shreyas");
//    	s.setCity("Nagpur");
//    	s.setPercentage(50.23);
//    	System.out.println(sd.insertStudent(s));
    	
//    	DELETE STUDENT
//    	System.out.println(sd.deleteStudentById(5005));

    	
//    	FIND STUDENT BY ID
//    	System.out.println(sd.findStudentById(1));
    	
    	List <Student> list = sd.findStudentByAny("555");
    	for(Student s: list) {
    		System.out.println(s);
    	}
    }
    
    
}
