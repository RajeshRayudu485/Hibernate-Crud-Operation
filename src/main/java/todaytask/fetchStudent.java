package todaytask;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class fetchStudent extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     int id=Integer.parseInt(req.getParameter("id"));
     
     
     mainClass main=new mainClass();
      
     Student1 s=main.fetchStudent(id);
     
     resp.getWriter().print("<h1> student id : "+s.getStdId()+"</h1>");
     resp.getWriter().print("<h1> student name : "+s.getStdName()+"</h1>");
     resp.getWriter().print("<h1> student address : "+s.getStdAdd()+"</h1>");
     resp.getWriter().print("<h1> student percentage : "+s.getStdPer()+"</h1>");
     resp.getWriter().print("<h1> student gender : "+s.getStdGen()+"</h1>");
     
     resp.getWriter().print("<h1>DATA DISPLAYED</h1>");
     req.getRequestDispatcher("home.html").include(req, resp);
	}
}
