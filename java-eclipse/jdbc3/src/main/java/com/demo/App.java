package com.demo;

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
    	
    	System.out.println(sd.deleteStudentById(5005));
    	
    	
    }
    
    
}
