package dao;

import java.util.ArrayList;

import guitar.entity.Guitar;

public interface InstrumentDao {
	public ArrayList<Instrument> getinstrument(String type,String size,String color,String material);
}
