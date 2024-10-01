package todaytask;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class updateDetails extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     int id=Integer.parseInt(req.getParameter("id"));
     String addres=req.getParameter("address");
     
     mainClass main=new mainClass();
     Student1 s= new Student1();
    main.updateStudent(id, addres);
     
     resp.getWriter().print("<h1>data updated</h>");
     req.getRequestDispatcher("home.html").include(req, resp);
      
	}
}
