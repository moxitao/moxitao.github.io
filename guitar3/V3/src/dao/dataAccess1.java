package dao;


public class dataAccess1 {
	private static String daoname = "sqliteDao";
	public static InstrumentDao createInstrumentDao(){
		InsrtumentDao result = null;
		try{
			Objiect o = Class.forname(daoname + "." + "InstrumentDaoImpl")
			result = (InstrumentDaoImpl)o;
		}catch(InstantiationException | IllegalAccessException | Class|)
		e.printStackTrace();
	}
	return result;
	}
	public static UserDao createUserDao(){
		UserDao result = null;
		try {
			Object o = Class.forname(daoname + "." +"UserDaoImpl")
		result = (UserDaoImpl)o;
		}catch(InstantiationException | IllegalAccessException)
	}