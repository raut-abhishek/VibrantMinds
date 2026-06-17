package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dao.UserDao;
import com.exception.UserNotFoundException;
import com.model.User;


public class App 
{
    public static void main( String[] args ){
    	UserDao ud = new UserDao();
    	User u = null;
    	
//    	Input methods
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	
    	
//    	Login system
    	System.out.println("Hey Welcome to the store!!");
    	System.out.println("Please login to continue shopping.");
    	String inputUserName = null;
    	String inputPassword = null;
    	try {
    		System.out.print("Username : ");
			inputUserName = br.readLine();
			System.out.print("Password : ");
			inputPassword = br.readLine();
			u = ud.login(inputUserName, inputPassword);
			System.out.println(u);
			
		} catch ( UserNotFoundException | IOException e) {
			e.printStackTrace();
		}
    	
    }
}
