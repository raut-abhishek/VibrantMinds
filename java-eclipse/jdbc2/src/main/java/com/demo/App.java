package com.demo;

import java.util.List;
import java.util.Random;

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
//    	Student  s = sd.findStudentByID(4);
//    	System.out.println(s);
//    	s.setCity("ShivajiNagar");
//    	System.out.println(s);
//    	System.out.println(sd.updateStudent(s));
    	
    	
//    	FIND ALL STUDENTS
//   	    List<Student> list = sd.findAllStudents();
//   	    for(Student s: list){
//            System.out.println(s);
//        }

    	String[] cities = {
    		    "Mumbai", "Delhi", "Bengaluru", "Hyderabad", "Ahmedabad",
    		    "Chennai", "Kolkata", "Pune", "Jaipur", "Surat",
    		    "Lucknow", "Kanpur", "Nagpur", "Indore", "Thane",
    		    "Bhopal", "Visakhapatnam", "Patna", "Vadodara", "Ghaziabad",
    		    "Ludhiana", "Agra", "Nashik", "Faridabad", "Meerut",
    		    "Rajkot", "Kalyan", "Vasai", "Varanasi", "Srinagar",
    		    "Aurangabad", "Dhanbad", "Amritsar", "Navi Mumbai", "Allahabad",
    		    "Ranchi", "Howrah", "Coimbatore", "Jabalpur", "Gwalior",
    		    "Vijayawada", "Jodhpur", "Madurai", "Raipur", "Kota",
    		    "Guwahati", "Chandigarh", "Solapur", "Hubli", "Mysuru",
    		    "Tiruchirappalli", "Bareilly", "Aligarh", "Tiruppur", "Moradabad",
    		    "Jalandhar", "Bhubaneswar", "Salem", "Warangal", "Guntur",
    		    "Bhiwandi", "Saharanpur", "Gorakhpur", "Bikaner", "Amravati",
    		    "Noida", "Jamshedpur", "Bhilai", "Cuttack", "Firozabad",
    		    "Kochi", "Nellore", "Bhavnagar", "Dehradun", "Durgapur",
    		    "Asansol", "Rourkela", "Nanded", "Kolhapur", "Ajmer",
    		    "Akola", "Gulbarga", "Jamnagar", "Ujjain", "Loni",
    		    "Siliguri", "Jhansi", "Ulhasnagar", "Jammu", "Sangli",
    		    "Mangalore", "Erode", "Belagavi", "Ambattur", "Tirunelveli",
    		    "Malegaon", "Gaya", "Jalgaon", "Udaipur", "Karnal"
    		};
    	
    	Random r = new Random();
    	for(int i = 0; i<=5000; i++) {
    		Student s = new Student();
    		StringBuilder name = new StringBuilder();
    		for(int j = 0; j<=15; j++) {
    			name.append((char) (r.nextInt(26)+65));
    		}
    		s.setName(name.toString());
    		s.setCity(cities[r.nextInt(cities.length)]);
    		s.setPercentage(r.nextFloat()*100);
    		System.out.println(sd.insertStudent(s));
    	}
    }
}
