package servlet;

import service.InstrumentService;

public class InstrumentServlet {

	
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
}

	protected viod doPost(HttpServletRequest request,HttpServletResponse response) throws ServletRequest;
	doGet(request,response);
	
}
	public viod initInventory(Inventory inventory){
			ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
			InstrumentService us =
					(InstrumentService)ac.getBean("instrumentService");
			inventory = us.getInventory();
	
	}