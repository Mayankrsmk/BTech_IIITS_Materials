package example;
import java.sql.Connection;

/* ADDING MYSQL JDBC DRIVER TO CLASS PATH:
 * Goto: Project->Properties->JavaBuildPath->Libraries->ClassPath
 * Add External Jar file in that
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBCTest {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
	  Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	  String query = "select * from books";
	  ResultSet rs = st.executeQuery(query);
	  rs.last();
	  rs.next();
	  while(rs.previous()) {
		  System.out.println(rs.getString("author")+","+rs.getString("title")+","+rs.getInt(3)+","+rs.getInt(4));
		  rs.updateInt(4, 100);
		  rs.updateRow();
	  }
	  
	  int c = 10;
	  int id1 = 101;
	  query = "update books set count = count+ ? where id = ?";
	  PreparedStatement ps = con.prepareStatement(query);
	  ps.setInt(1, c);
	  ps.setInt(2, id1);
	  int count = ps.executeUpdate();

	  query = "select * from books";
	  rs = st.executeQuery(query);
	  while(rs.next()) {
		  System.out.println(rs.getString("author")+","+rs.getString("title")+","+rs.getInt(3)+","+rs.getInt(4));
		
	  }
	  
	  query = "create procedure proc1(IN count1 int, IN id1 int) begin update books set count = count+ count1 where id = id1; end";
	  st.executeUpdate(query);
	  
	  CallableStatement cs = con.prepareCall("call proc1(?,101)");
	  cs.setInt(1, 5);
	  cs.execute();
	  
	  con.close();
  }
}
