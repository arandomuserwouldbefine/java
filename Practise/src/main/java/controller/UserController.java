package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import connection.DBConnection;
import model.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			User user = new User();
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			user.setName(request.getParameter("name"));
			if (UserDAO.emailExists(user.getEmail())) {
				request.setAttribute("msg", "Account already in user");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			} else {
				UserDAO.insertUser(user);
				request.setAttribute("msg", "Account created successfully");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}

		// Login

		else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			if (!UserDAO.emailExists(email)) {
				request.setAttribute("msg", "Account doesn't exist");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				User u1 = UserDAO.Login(email, password);
				if (u1 == null) {
					request.setAttribute("msg", "Invalid credentials");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", u1);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}

			}
		} else if (action.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			User ud = UserDAO.userDetails(id);
			if (ud == null) {
				response.sendRedirect("home.jsp");
			} else {
				HttpSession session = request.getSession();
				request.setAttribute("data", ud);
				request.getRequestDispatcher("update.jsp").forward(request, response);
			}

		} else if (action.equalsIgnoreCase("update")) {
			User u = new User();
			u.setEmail(request.getParameter("email"));
			u.setName(request.getParameter("name"));
			u.setPassword(request.getParameter("password"));
			u.setGender(request.getParameter("gender"));
			u.setId(Integer.parseInt(request.getParameter("id")));

			String[] hobbies = request.getParameterValues("hobbies");
			List<String> test = new ArrayList<String>();
			Connection conn = DBConnection.getConnection();
			String deleteQuery = "delete from hobbies where user_id = ?";
			try {
				PreparedStatement deletePst = conn.prepareStatement(deleteQuery);
				deletePst.setInt(1, u.getId());
				deletePst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (hobbies != null) {
				for (int i = 0; i < hobbies.length; i++) {
					test.add(hobbies[i]);
				}
				u.setHobbies(test);
			}

			UserDAO.UpdateUser(u);
			response.sendRedirect("home.jsp");
		}

	}

}
