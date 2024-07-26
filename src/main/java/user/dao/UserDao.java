package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import user.entity.User;

public class UserDao {


	public User saveUser(User usr)  {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");


			String url="jdbc:mysql://localhost:3306/first";
			String user="root";
			String password="root";

			Connection con=DriverManager.getConnection(url, user, password);

			PreparedStatement pStatement= con.prepareStatement("Insert into User values(?,?,?,?,?)");

			pStatement.setInt(1, usr.getUserId());		
			pStatement.setString(2, usr.getUserName());
			pStatement.setString(3, usr.getUserEmail());
			pStatement.setString(4, usr.getUserPassword());
			pStatement.setString(5, usr.getUserLocation());

			pStatement.execute();
			con.close();

		} 

		catch (Exception e) {

			e.printStackTrace();
		}

		return usr;

	}

	public User findUser(int userId) {



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");


			String url="jdbc:mysql://localhost:3306/first";
			String user="root";
			String password="root";

			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pst= con.prepareStatement("select * from user u  where userId=?");
			pst.setInt(1, userId);

			ResultSet rs= pst.executeQuery();

			if(rs.isBeforeFirst()) {

				User usr=new User();

				    rs.next();
					usr.setUserId(rs.getInt(1));
					usr.setUserName(rs.getString(2));
					usr.setUserEmail(rs.getString(3));
					usr.setUserPassword(rs.getString(4));
					usr.setUserLocation(rs.getString(5));
							
				return usr;
			}
		}

		catch(Exception ee) {
			ee.printStackTrace();
		}

		return null;
	}

	public User deleteUser(int userid) {

		User dbuser=findUser(userid);
		
		if(dbuser!=null) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");


				String url="jdbc:mysql://localhost:3306/first";
				String user="root";
				String password="root";

				Connection con=DriverManager.getConnection(url, user, password);
				PreparedStatement pst= con.prepareStatement("delete from user where userId=?");
				pst.setInt(1, userid);

				pst.executeUpdate();
				
				con.close();

				return dbuser;
			}
			
			catch(Exception ee) {
				ee.printStackTrace();
			}

		}

		return null;
	}

}
