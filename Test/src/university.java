import java.sql.*;

public class university {
	
	public static void registerUser()throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
	    String registerQuery = "insert into users (user_id, username, password, email, user_type) values (?, ?, ?, ?, ?)";
        Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(registerQuery);
		pst.setInt(1, 1);
		pst.setString(2, "Aswin Raj");
		pst.setString(3, "061197");
		pst.setString(4, "aswin@gmail.com");
		pst.setString(5, "Student");
		pst.executeUpdate();
		con.close();
	}
	public static void getUser() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
		String selectQuery = "select * from users where user_id = 1";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rt =  st.executeQuery(selectQuery);
		while(rt.next()) {
			System.out.println("User ID: " + rt.getInt("user_id"));
            System.out.println("Username: " + rt.getString("username"));
            System.out.println("Password: " + rt.getString("password"));
            System.out.println("Email: " + rt.getString("email"));
            System.out.println("User Type: " + rt.getString("user_type"));
		}
	}
	public static void deleteUser() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
		String deleteQuery = "delete from users where user_id = ?";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(deleteQuery);
		pst.setInt(1, 1);
		pst.executeUpdate();
		con.close();
	}
	public static void updateUser() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
		String updateQuery = "update users set username = ?, password = ?, email = ?, user_type = ? where user_id = ?";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(updateQuery);
		pst.setString(1, "Aswin R");
        pst.setString(2, "100594");
        pst.setString(3, "aswinraj@gmail.com");
        pst.setString(4, "Student"); 
        pst.setInt(5, 1);
		pst.executeUpdate();
		con.close();
	}
	 
	 public static void assignInstructorToCourse() throws Exception {
	 	String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
	    String assignQuery = "insert into instructors (instructor_id, user_id, full_name, instructor_number) values (?, ?, ?, ?)";
	    Connection con = DriverManager.getConnection(url, username, password);
	    PreparedStatement pst = con.prepareStatement(assignQuery);  
        pst.setInt(1, 1);
        pst.setInt(2, 1); 
        pst.setString(3, "Nithish");
        pst.setString(4, "I12345");
        pst.executeUpdate();
		con.close();
	    }
	 public static void enrollStudentInCourse() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
	    String enrollQuery = "insert into enrollments (student_id, course_id, status) values (?, ?, 'enrolled')";
	    Connection con = DriverManager.getConnection(url, username, password);
	    PreparedStatement pst = con.prepareStatement(enrollQuery);  
	    pst.setInt(1, 1); 
	    pst.setInt(2, 1); 
        pst.executeUpdate();
		con.close();
	    }
	public static void updateEnrollments() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
		String updateEnrollmentsQuery = "update enrollments set status = 'dropped' WHERE student_id = ?";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(updateEnrollmentsQuery);
		pst.setInt(1, 1);
		pst.executeUpdate();
		con.close();
		}
	 public static void insertCourse() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/university";
		String username = "root";
		String password = "2525";
	    String insertCourseQuery = "insert into courses (course_id, course_code, course_name) values (?, ?, ?)";
	    Connection con = DriverManager.getConnection(url, username, password);
	    PreparedStatement pst = con.prepareStatement(insertCourseQuery);  
	    pst.setInt(1, 1);
        pst.setString(2, "CSCI101");
        pst.setString(3, "Introduction to Computer Science");
        pst.executeUpdate();
		con.close();  
	    }

    public static void main(String[] args)throws Exception {
		registerUser();
		getUser();
		deleteUser();
		updateUser();
		assignInstructorToCourse();
		enrollStudentInCourse();
		updateEnrollments();
        insertCourse();  
    }
}

