package JavaStud.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String uname=request.getParameter("uname");
	String password=request.getParameter("password");
	PrintWriter out=response.getWriter();
	//out.println("the uname is " +uname);
	//out.println("the password is " +password);
	if(uname.equals("admin")&& password.equals("admin")){
		RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
		rd.forward(request, response);
		
	}
	else{
		request.setAttribute("uname", uname);
		request.setAttribute("password", password);
		out.println("<h1> Invalid username and password</h1>");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		
	}
	
	}

}
