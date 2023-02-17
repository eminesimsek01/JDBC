package jdbc;

import java.sql.*;
class DeletePrepared{
	public static void main(String args[]){
		try{
			//db parameters
			String url       = "jdbc:mysql://localhost:3306/fsae01";
			String user      = "root";
			String password  = "Emine2357,";

			//Class.forName("com.mysql.cj.jdbc.Driver");

			//create a connection to the database
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement stmt=con.prepareStatement("delete from ogrenciler where id=? and isim=?, sinav_notu?");
			stmt.setInt(1,122);
			stmt.setString(2,"Emine");
			stmt.setInt(3,67);

			int i=stmt.executeUpdate();
			System.out.println(i+" records deleted");

			con.close();

		}catch(Exception e){ System.out.println(e);}
	}
}