package sqliteDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dao.InstrumentDao;
import util.DBUtil;
import model.Guitar;

public class InstrumentDaoImpl implements InstrumentDao{
	@Override
	public ArrayList<Instrument> getinstrument(String type,String size,String color,String material) {
		// TODO Auto-generated method stub
		String str = "select * from instrument where 1 = 1 ";
		
		/*if(typ!=null){
			sql+="and Instrument_size=41";
		}*/
		if(type!=""){
			str+=String.format("and instrument_type='"+type+"'");
		}
		if(size!=""){
			str+=String.format("and instrument_size='"+size+"'");
		}
		if(color!=""){
			str+=String.format("and instrument_color='"+color+"'");
		}
		if(material!=""){
			str+=String.format("and instrument_material='"+material+"'");
		}
		/*
		if(color!=""){
			sql+=String.format("and instrument_color='"+color+"'");
		}
		if(material!=""){
			sql+=String.format("and instrument_material='"+material+"'");
		}*/
		ResultSet rs=DBUtil.executeQuery(str,new Object[]{});
		ArrayList<Instrument> instrumentlist=new ArrayList<Instrument>();
		try{
			while(rs.next()){
				Instrument instrument=new Instrument();
				instrument.setId(rs.getInt(1));
				instrument.setName(rs.getString(2));
				instrument.setType(rs.getString(3));
				instrument.setPrice(rs.getDouble(4));
				instrument.setSize(rs.getString(5));
				instrument.setColor(rs.getString(6));
				instrument.setMaterial(rs.getString(7));
				instrument.setLocation(rs.getString(8));
				instrument.setDescriprition(rs.getString(9));
				instrumentlist.add(instrument);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitarlist;
	}

}
