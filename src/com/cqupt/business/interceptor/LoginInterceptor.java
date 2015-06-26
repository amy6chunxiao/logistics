package com.cqupt.business.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.cqupt.business.model.Customer;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String url = request.getRequestURI();
		String urlName = url.substring(url.lastIndexOf("/") + 1);
		if (urlName.equals("login.action") || urlName.equals("login.jsp")
				|| urlName.equals("index.jsp")) {
			return true;
		}
		Customer customer = (Customer) request.getSession()
				.getAttribute("user");
		if (customer != null) {
			request.getRequestDispatcher("/login.jsp").forward(request,
					response);
			return false;
		}
		return true;
	}
}
