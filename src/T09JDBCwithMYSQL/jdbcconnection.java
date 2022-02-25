package T09JDBCwithMYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcconnection {

	public static Connection connection;

	public static Connection getconnection() throws ClassNotFoundException, SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "Kanha");
			System.out.println("Connection success..");

			return connection;
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
			connection.close();
		}
		return null;

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		getconnection();
	}

}
