package sqliteDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import guitar.Dao.GuitarDao;

public class UserDaoImpl implements UserDao{
	@Override
	public ArrayList<User> getuser(String username,String password) {
		// TODO Auto-generated method stub
		String str = "select * from user where 1 = 1 ";
		
		/*if(typ!=null){
			sql+="and guitar_size=41";
		}*/
		if(type!=""){
			str+=String.format("and user_username='"+username+"'");
		}
		if(size!=""){
			str+=String.format("and user_password='"+password+"'");
		}
		
		ResultSet rs=DBUtil.executeQuery(str,new Object[]{});
		ArrayList<User> userlist=new ArrayList<User>();
		try{
			while(rs.next()){
				User user=new User();
				user.setId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userlist;
	}

}
