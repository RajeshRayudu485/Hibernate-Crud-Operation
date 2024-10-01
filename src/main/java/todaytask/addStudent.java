package todaytask;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/addStudent")
@MultipartConfig
public class addStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name=req.getParameter("name");
      String address=req.getParameter("address");
      double per=Double.parseDouble(req.getParameter("percentage"));
      String gender=req.getParameter("gender");
      Part p = req.getPart("file");
      InputStream i = p.getInputStream();
      byte[] arr=new byte[i.available()];
      i.read(arr);
      Student1 s=new Student1();
      s.setStdName(name);
      s.setStdAdd(address);
      s.setStdPer(per);
      s.setStdGen(gender);
      s.setImage(arr);
      
      mainClass main=new mainClass();
      main.addStudentDetails(s);
      
      resp.getWriter().print("<h1>Data Inserted</h1>");
      req.getRequestDispatcher("home.html").include(req, resp);
	}
}
