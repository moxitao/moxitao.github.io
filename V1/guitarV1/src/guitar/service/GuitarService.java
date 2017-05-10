package guitar.service;

import java.util.ArrayList;

import guitar.Dao.GuitarDaoJDBCImpl;
import guitar.entity.Guitar;

public class GuitarService {
	private static GuitarDaoJDBCImpl  guitardaoJDBC=new GuitarDaoJDBCImpl();
	public void setProductDao(GuitarDaoJDBCImpl guitardaoJDBC) {
		this.guitardaoJDBC = guitardaoJDBC;
	}
	public ArrayList<Guitar> getguitar(String type,String size,String color,String material) {
		 return guitardaoJDBC.getguitar(type,size,color,material);
	 }
}
