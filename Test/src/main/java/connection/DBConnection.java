package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
			return conn;
		} catch (Exception e) {
//			What is e.printStackTrace();
//			Prints this throwable and its backtrace to the standard error stream. This method prints a stack trace for this Throwable object on the error output stream that isthe value of the field System.err. The first line ofoutput contains the result of the toString() method forthis object.
			
			e.printStackTrace();
		}
		return null;
	}

}
