import java.sql.*;

public class Update {
	public static void updatedata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/customer";
		String username = "root";
		String password = "2525";
		String Query = "update user set fullname = ?, email = ? WHERE id = ?";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setString(1, "Aswin");
        pst.setString(2, "Aswinraj@gmail.com");
        pst.setInt(3, 2);
		pst.executeUpdate();
		con.close();
	}
	
	
	public static void main(String[]args) throws Exception{
	updatedata();
	}
}
