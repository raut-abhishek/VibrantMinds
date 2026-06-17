package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exception.UserNotFoundException;
import com.model.User;
import com.util.MyDatabase;

public class UserDao {
	public User login(String userName, String password) throws UserNotFoundException{
		User u = null;
		String sql = "select * from users where user_name = ? and password = ? ";
		try (
				Connection con = MyDatabase.createConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				){
			pst.setString(1, userName);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
			    u = new User();
			    u.setId(rs.getInt("user_id"));
			    u.setUserName(rs.getString("user_name"));
			    u.setRole(rs.getString("role"));
			    u.setPassword(rs.getString("password"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(u == null) {
		    throw new UserNotFoundException("User not found");
		}
		
		return u;
	}
}
