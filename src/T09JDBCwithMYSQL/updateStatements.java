package T09JDBCwithMYSQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateStatements {
	
	public static void update() {
		
		String sql="update info set Password=?,FullName=?,Email=? where UserName=?";
		
		try {
			PreparedStatement st=jdbcconnection.getconnection().prepareStatement(sql);
		
			st.setString(1, "12364");
			st.setString(2, "William henry Bill Gates");
			st.setString(3, "Bill@gmial.com");
			st.setString(4, "Bill");
			
			int rowsUpdated=st.executeUpdate();
			if(rowsUpdated>0) {
				System.out.println("An existing use was updated successfully");
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
		update();

	}

}
