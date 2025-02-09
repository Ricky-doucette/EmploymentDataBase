import java.sql.*;

public class TestJdbcSqlServer
{	public static void main(String[] args)
	{	String url = "jdbc:sqlserver://localhost;DatabaseName=WorksOn";
	String uid = "root";
	String pw = "304rootpw";
			
		try ( Connection con = DriverManager.getConnection(url, uid, pw);
	          Statement stmt = con.createStatement();) 
	    {			
			ResultSet rst = stmt.executeQuery("SELECT ename,salary FROM emp");
			System.out.println("Employee Name,Salary");
			while (rst.next())
			{	System.out.println(rst.getString("ename")+","+rst.getDouble("salary"));
			}
		}
		catch (SQLException ex)
		{
			System.err.println("SQLException: " + ex);
		}		
	}
}

