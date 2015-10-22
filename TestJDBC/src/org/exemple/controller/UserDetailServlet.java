package org.exemple.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exemple.model.User;
import org.exemple.model.UserManager;

/**
 * Servlet implementation class UserDetailServlet
 */
@WebServlet("/user/detail")
public class UserDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =request.getParameter("id");
		
		if(id!=null && !id.isEmpty()){
			User u = UserManager.getInstance().getbyId(Integer.parseInt(id));
			displayView(request, response, u);
		}
		else {
			displaView(request,response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	private void displaView(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>New user</h1><form action='update'>");
		out.println("<label>Id</label><input type='text' name='id' /><br/>");
		out.println("<label>First</label><input type='text' name='firstname' /><br/>");
		out.println("<label>Last</label><input type='text' name='lastname' /><br/>");
		out.println("<label>Address</label><input type='text' name='address' /><br/>");
		out.println("<button type='submit'>Create</button></form><a href='list'>back</a></body></html>");
	}

	private void displayView(HttpServletRequest request, HttpServletResponse response, User user) throws IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>User detail</h1><form action='update'>");
		out.println("<label>Id</label><input type='text' name='id' value='" + user.getId() + "'/><br/>");
		out.println("<label>First</label><input type='text' name='firstname' value='" + user.getFirstname() + "'/><br/>");
		out.println("<label>Last</label><input type='text' name='lastname' value='" + user.getLastname() + "'/><br/>");
		out.println("<label>Address</label><input type='text' name='address' value='" + user.getAddress() + "'/><br/>");
		out.println("<button type='submit'>Update</button></form><a href='list'>back</a></body></html>");
	}
}
