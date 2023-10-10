import java.sql.*;
public class Insert {
	public static void insertdata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/customer";
		String username = "root";
		String password = "2525";
		String Query = "insert into user values(?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 2);
		pst.setString(2, "Aswin");
		pst.setString(3, "aswin@gmail.com");
		pst.executeUpdate();
		con.close();
	}
	
	
	public static void main(String[]args) throws Exception{
	insertdata();
	}
}
