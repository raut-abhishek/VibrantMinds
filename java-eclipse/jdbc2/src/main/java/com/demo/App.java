package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	StudentDao sd = new StudentDao();
    	
    	
//    	INSERT STUDENT
//    	Student s = new Student();
//    	s.setId(5);
//    	s.setName("Virendra");
//    	s.setCity("Phaltan");
//    	s.setPercentage(83.30);
//    	System.out.println(sd.insertStudent(s));
    	
    	
//    	FIND SINGLE STUDENT
//    	Student  s = sd.findStudentByID(4);
//    	System.out.println(s);
    	
    	
    	
//    	FIND SINGLE STUDENT AND UPDATE
    	Student  s = sd.findStudentByID(4);
    	System.out.println(s);
    	s.setCity("ShivajiNagar");
    	System.out.println(s);
//    	System.out.println(sd.updateStudent(s));

    	
    }
}
