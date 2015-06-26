package com.cqupt.business.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
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
	public @ResponseBody
	JSONObject logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("operation", "success");
		return jsonObject;
	}

	@RequestMapping("/delete")
	public void deleteUser() {

	}

	@RequestMapping("/login")
	public String checkCustomer(HttpServletRequest request) {
		String name = request.getParameter("user-name");
		String password = request.getParameter("pass-word");
		Customer customer = customerService.checkCustomer(name, password);
		if (customer != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", customer);
		}
		return "/start.jsp";
	}
}
