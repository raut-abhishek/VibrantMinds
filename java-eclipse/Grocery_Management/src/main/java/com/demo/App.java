package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dao.UserDao;
import com.exception.UserNotFoundException;
import com.model.User;


public class App 
{
    public static void main( String[] args )throws IOException{


    	startApp();
    	
    }
    
    
    
    public static void startApp() {
    	
//    	Input methods
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	
    	
		System.out.println("Hey Welcome to the store!!");
    	System.out.println("1.Login");
    	System.out.println("2.Exit");
    	
    	boolean running  = true;
    	int choice = 0;
    	
    	while(running) {

        	
        	try {
        		choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	
        	if(choice == 1) {
        		UserDao ud = new UserDao();;
        		User u = null;
        		
//        		Login sys
        		String inputUserName = null;
        		String inputPassword = null;
        		
        		try {
        			System.out.print("Username : ");
					inputUserName = br.readLine();
					System.out.print("Password : ");
					inputPassword = br.readLine();
					u = ud.login(inputUserName, inputPassword);
					System.out.println(u);
					System.out.println();
					
					if(u.getRole().equals("customer")) {
						customerMenu(u, br);
					}
					else if(u.getRole().equals("manager")) {
						managerMenu(u, br);
					}
					
					
					
				} catch (UserNotFoundException | IOException e) {
					e.printStackTrace();
				}
        		
        	}
        	else if(choice == 2) {
        		running  = false;
        		System.out.println("Thankyou! Visit again");
        	}
    	}
    }
    
    
    public static void managerMenu(User u, BufferedReader br) {
    	System.out.println("Testing  Manager menu");
    }
    
    public static void customerMenu(User u, BufferedReader br) {
    	
    }
}
