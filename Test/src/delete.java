import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete {
	public static void deletedata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/customer";
		String username = "root";
		String password = "2525";
		String Query = "delete from user where id = ?";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
        pst.setInt(1, 2);
		pst.executeUpdate();
		con.close();
	}
	
	public static void main(String[]args) throws Exception{
	deletedata();
	}
}

