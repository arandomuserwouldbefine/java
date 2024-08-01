package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.UserDatabase;

import DAO.CustomerDAO;
import DAO.SellerDAO;
import model.Customer;
import model.Seller;
import model.SellerModel;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Customer customer = new Customer();
			customer.setName(request.getParameter("name"));
			customer.setAddress(request.getParameter("address"));
			customer.setEmail(request.getParameter("email"));
			customer.setPassword(request.getParameter("password"));
			customer.setContact(Long.parseLong(request.getParameter("contact")));
			if (CustomerDAO.emailExists(request.getParameter("email")) == true) {
				response.sendRedirect("index.jsp?error=email already exists");
			} else {
				CustomerDAO.RegisterCustomer(customer);
				response.sendRedirect("index.jsp");
			}
		}
		
		
		
		else if(action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			if(CustomerDAO.emailExists(email) == true) {
				Customer customer = CustomerDAO.customerLogin(email, password);
				if(customer == null) {
					response.sendRedirect("customer-login.jsp?error=invalid credentials");
				}
				else {					
					HttpSession session = request.getSession();
					session.setAttribute("data", customer);
					request.getRequestDispatcher("customer-home.jsp").forward(request, response);
				}
			}
			else {
				response.sendRedirect("customer-login.jsp?error=Email doesn't exist");
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
			request.getRequestDispatcher("customer-home.jsp").forward(request, response);
		}
		
			
		else if(action.equalsIgnoreCase("updatePassword")) {
			String old_password = request.getParameter("old_password");
			String password = request.getParameter("password");
			int id = Integer.parseInt(request.getParameter("id"));
			if(SellerDAO.correctPassword(old_password) == true) {
				SellerDAO.changePassword(id, password);
				response.sendRedirect("customer-home.jsp");
			}
			else {
				response.sendRedirect("customer-change-password.jsp?err=Incorrect old password");
			}
			
		}
		
	}
	
	

}
