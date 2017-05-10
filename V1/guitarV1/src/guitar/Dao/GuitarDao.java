package guitar.Dao;

import java.util.ArrayList;

import guitar.entity.Guitar;

public interface GuitarDao {
	public ArrayList<Guitar> getguitar(String type,String size,String color,String material);
}
