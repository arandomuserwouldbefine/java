package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import model.User;

@WebServlet("/register")
public class UserController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {

//			1) create an instance of model class
			User user = new User();
//			2) Set form values inside the model class
			user.setName(request.getParameter("name"));
			user.setAddress(request.getParameter("address"));
			user.setContact(Long.parseLong(request.getParameter("contact")));
			user.setPassword(request.getParameter("password"));
			user.setEmail(request.getParameter("email"));
			;
			if (UserDAO.emailExists(user.getEmail())) {
				request.setAttribute("msg", "account already exist");
				request.getRequestDispatcher("register.jsp").forward(request, response);

			} else {
				UserDAO.insertUser(user);
				request.setAttribute("msg", "account created successfully");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		}

//		4) create an instance of connection class 
//		5) insert the data

	}

}
