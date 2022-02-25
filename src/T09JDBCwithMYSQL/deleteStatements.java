package T09JDBCwithMYSQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteStatements {

	public static void delete() {

		String sql = "delete from info where UserName=?";

		try {
			PreparedStatement ps = jdbcconnection.getconnection().prepareStatement(sql);

			ps.setString(1,"Bill");

			int rowsDeleted = ps.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		delete();
	}

}
