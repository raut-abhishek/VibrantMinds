package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	StudentDao sd = new StudentDao();
    	Student s = new Student();
    	s.setId(4);
    	s.setName("Dhanashree");
    	s.setCity("Panhera");
    	s.setPercentage(92.80);
    
    	
//    	System.out.println(sd.insertStudent(s));
    	System.out.println(sd.updateStudent(s));

    	
    }
}
