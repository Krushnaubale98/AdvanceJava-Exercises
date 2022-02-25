package T09JDBCwithMYSQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStatements {

// A simple program that demonstrates how to execute SQL insert statement
	public void add() {

		try {
			String sql = "insert into info (UserName,Password,FullName,Email)values(?,?,?,?)";

			PreparedStatement ps = jdbcconnection.getconnection().prepareStatement(sql);

			ps.setString(1, "Bill");
			ps.setString(2, "secretpass");
			ps.setString(3, "Bill gates");
			ps.setString(4, "Bill.gates@gmail.com");

			int rowsInserted = ps.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted succcessfully");
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InsertStatements a = new InsertStatements();
		a.add();

	}

}
