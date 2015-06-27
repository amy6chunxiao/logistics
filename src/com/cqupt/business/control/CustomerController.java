package com.cqupt.business.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqupt.business.model.Customer;
import com.cqupt.business.service.CustomerService;

@Controller
@RequestMapping("/user")
public class CustomerController {
	@Resource
	private CustomerService customerService;

	@Resource(name = "customerService")
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping("/add")
	public String addUser() {
		return null;
	}

	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write("success");
		out.close();
	}

	@RequestMapping("/delete")
	public void deleteUser() {

	}

	@RequestMapping("/login")
	public String checkCustomer(HttpServletRequest request) {
		String name = request.getParameter("user-name");
		String password = request.getParameter("user-password");
		Customer customer = customerService.checkCustomer(name, password);
		if (customer != null) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			session.setAttribute("pow", customer.getPow());
		}
		return "/index.jsp";
	}
}
