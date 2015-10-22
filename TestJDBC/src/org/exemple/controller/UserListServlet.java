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
 * Servlet implementation class UserListServlet
 */
@WebServlet("/user/list")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		displayView(request, response, UserManager.getInstance().getAll());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void displayView(HttpServletRequest request, HttpServletResponse response, List<User> users) throws IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>User list</h1><a href='detail'>New user</a><table>");
		for (User u : users){
			out.println("<tr>");
			out.println("<td> #" + u.getId() + "</td>");
			out.println("<td>" + u.getFirstname() + "</td>");
			out.println("<td>" + u.getLastname() + "</td>");
			out.println("<td>" + u.getAddress() + "</td>");
			out.println("<td><a href='detail?id=" + u.getId() + "'>Details</a></td>");
			out.println("</tr>");
		}
		out.println("</table></body></html>");
		
	}

}
