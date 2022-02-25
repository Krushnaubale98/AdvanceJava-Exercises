package T09JDBCwithMYSQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatements {

	public  void select() {

		String sql = "select * from info";

		try {
			Statement st = jdbcconnection.getconnection().createStatement();
			ResultSet result = st.executeQuery(sql);
			int count = 0;

			while (result.next()) {
				String name = result.getString(2);
				String password = result.getString(3);
				String fullname = result.getString(4);
				String email = result.getString(5);

				//System.out.println(name+" "+password+" "+fullname+" "+email);
				
				String output="User #%d: %s - %s- %s- %s";
				System.out.println(String.format(output,++count,name ,password,fullname,email));
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
				e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		SelectStatements a=new SelectStatements();
		a.select();

	}

}
