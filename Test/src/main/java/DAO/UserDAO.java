package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.DBConnection;
import model.User;

public class UserDAO {

	public static void insertUser(User user) {
		Connection conn = DBConnection.getConnection();
		String sql = "insert into user (name, email, address, contact,  password) values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getAddress());
			pst.setLong(4, user.getContact());
			pst.setString(5, user.getPassword());
			int row = pst.executeUpdate();
			System.out.println("Rows affected : " + row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static boolean emailExists(String email) {
		Connection conn = DBConnection.getConnection();
		String sql = "select id from user where email = ?";

		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet res = pst.executeQuery();
			if(res.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
