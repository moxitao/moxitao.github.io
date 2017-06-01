package service;

public class InstrumentService {
	private InstrumentDao dao = dataAccess1.createInstrumentDao();
	public InstrumentService(){}
	public Inventory getInventory {
	Inventory inverntory = new Inverntory();
	List<Instrument>list = dao.getAllInstruments();
	for(Insrument i : list){
		inventory.addInstrument(i.getSerialNumber(),i.getPrice(),
	}
	return inverntory
}
}