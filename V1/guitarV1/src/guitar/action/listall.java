package guitar.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import myproject.entity.Guitar;
import myproject.service.GuitarService;

import com.opensymphony.xwork2.ActionSupport;

public class getall extends ActionSupport{
	HttpServletRequest request=ServletActionContext.getRequest();
	HttpSession session =request.getSession();
	public String execute() throws Exception{
		GuitarService guitarservice = new GuitarService();
		
		String type=request.getParameter("type");
		String size=request.getParameter("size");
		String color=request.getParameter("color");
		String material=request.getParameter("material");
		List<Guitar> guitarlist = guitarservice.getguitar(type,size,color,material);
		session.setAttribute("guitarlist", guitarlist);
		return SUCCESS;
	}

}
