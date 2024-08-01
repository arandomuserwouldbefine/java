package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.UserDatabase;

import DAO.SellerDAO;
import model.Seller;
import model.SellerModel;

@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Seller seller = new Seller();
			seller.setName(request.getParameter("name"));
			seller.setAddress(request.getParameter("address"));
			seller.setEmail(request.getParameter("email"));
			seller.setPassword(request.getParameter("password"));
			seller.setContact(Long.parseLong(request.getParameter("contact")));
			if (SellerDAO.emailExists(request.getParameter("email")) == true) {
				response.sendRedirect("index.jsp?error=email already exists");
			} else {
				SellerDAO.RegisterSeller(seller);
				response.sendRedirect("index.jsp");
			}
		}
		
		
		
		else if(action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			if(SellerDAO.emailExists(email) == true) {
				Seller seller = SellerDAO.SellerLogin(email, password);
				if(seller == null) {
					response.sendRedirect("seller-login.jsp?error=invalid credentials");
				}
				else {					
					HttpSession session = request.getSession();
					session.setAttribute("data", seller);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}
			}
			else {
				response.sendRedirect("seller-login.jsp?error=Email doesn't exist");
			}
		}
		
		
		else if (action.equalsIgnoreCase("updateProfile")) {
			Seller seller = new Seller();
			seller.setId(Integer.parseInt(request.getParameter("id")));
			seller.setName(request.getParameter("name"));
			seller.setAddress(request.getParameter("address"));
			seller.setEmail(request.getParameter("email"));
			seller.setPassword(request.getParameter("password"));
			seller.setContact(Long.parseLong(request.getParameter("contact")));
			SellerDAO.UpdateSellerProfile(seller);
			HttpSession session = request.getSession();
			session.setAttribute("data", seller);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
		}
		
			
		else if(action.equalsIgnoreCase("updatePassword")) {
			String old_password = request.getParameter("old_password");
			String password = request.getParameter("password");
			int id = Integer.parseInt(request.getParameter("id"));
			if(SellerDAO.correctPassword(old_password) == true) {
				SellerDAO.changePassword(id, password);
				response.sendRedirect("seller-home.jsp");
			}
			else {
				response.sendRedirect("seller-change-password.jsp?err=Incorrect old password");
			}
			
		}
		
	}
	
	

}
