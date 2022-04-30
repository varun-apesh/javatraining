package simplehtml;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Getname extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out= res.getWriter();
		String s= req.getParameter("userid");
		String p= req.getParameter("password");
		String a= "vasapps@gmail.com";
		String b= "apps1365";
		if(s.equals(a) && p.equals(b))
		{
			RequestDispatcher rd= req.getRequestDispatcher("NewFile1.html");
			rd.forward(req, res);
		}
		else
		{
			out.println("<font color=red><b>Wrong credentials</b></font>");
		}
			
		
		
	}

}
