package dao;

import java.util.ArrayList;

import guitar.entity.Guitar;

public interface UserDao {
	public ArrayList<User> getuser(String username,String password);
}
