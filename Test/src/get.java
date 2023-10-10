import java.sql.*;
public class get {
	public static void getData() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/customer";
		String username = "root";
		String password = "2525";
		String Query = "select * from user where id = 1";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rt =  st.executeQuery(Query);
		while(rt.next()) {
			System.out.println("id : "+rt.getInt(1));
			System.out.println("fullname : "+rt.getString(2));
			System.out.println("email : "+rt.getString(3));
		}
	}
	public static void main (String[] args) throws Exception {
		getData();
	}
}
