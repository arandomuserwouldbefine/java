package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import model.Seller;

public class SellerDAO {

	public static void RegisterSeller(Seller seller) {
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "insert into seller (name, email, address, contact ,password) values ( ?, ?, ?, ?, ?) ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, seller.getName());
			pst.setString(2, seller.getEmail());
			pst.setString(3, seller.getAddress());
			pst.setLong(4, seller.getContact());
			pst.setString(5, seller.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean emailExists(String email) {
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "select id from seller where email = ? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public static Seller SellerLogin(String email, String password) {
		Seller seller = null;
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "select * from seller where email = ? and password = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				seller = new Seller();
				seller.setId(rs.getInt("id"));
				seller.setName(rs.getString("name"));
				seller.setAddress(rs.getString("address"));
				seller.setEmail(rs.getString("email"));
				seller.setContact(Long.parseLong(rs.getString("contact")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return seller;
	}
	
	
		
	public static void UpdateSellerProfile(Seller seller) {
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "update seller set name = ?, email = ?, address = ?, contact = ?, password = ? where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, seller.getName());
			pst.setString(2, seller.getEmail());
			pst.setString(3, seller.getAddress());
			pst.setLong(4, seller.getContact());
			pst.setString(5, seller.getPassword());
			pst.setInt(6, seller.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean correctPassword(String password) {
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "select id from seller where password = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void changePassword(int id, String password) {
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "update seller set password = ? where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, password);
			pst.setInt(2, id);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
