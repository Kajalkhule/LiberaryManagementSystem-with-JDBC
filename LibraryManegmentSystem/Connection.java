package LibraryManegmentSystem;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	
	static Connection con;
	public static Connection createc() {
		
		try {
			
		
			Class.forName("com.mysql.cj.jdbc.Driver");

			String user = "root"; 
			String password = "root"; 
			String url = "jdbc:mysql://localhost:3306/Libray_db";
			con = (Connection) DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
}
