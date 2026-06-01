package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;
import com.util.MyDatabase;

public class StudentDao {

	public int insertStudent(Student s) {
		
		int check = 0;
		String sql = "insert into student (name, city, percentage) values (?,?,?)";
		
		try(
				Connection con = MyDatabase.createConnection();
				PreparedStatement pst = con.prepareStatement(sql);
			){
			
			pst.setString(1,s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			check = pst.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	public int deleteStudentById(int id) {
		int check = 0;
		String sql = "delete from student where id = ?";
		try(
				Connection con = MyDatabase.createConnection();
				PreparedStatement pst = con.prepareStatement(sql);
			){
			pst.setInt(1, id);
			check = pst.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
}
