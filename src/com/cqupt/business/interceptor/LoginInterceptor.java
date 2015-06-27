package com.cqupt.business.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.cqupt.business.model.Customer;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		System.out.println("登录拦截器");
		String url = request.getRequestURI();
		String urlName = url.substring(url.lastIndexOf("/") + 1);
		if (urlName.equals("login.action") || urlName.equals("login.jsp")
				|| urlName.equals("index.jsp")) {
			return true;
		}
		Customer customer = (Customer) request.getSession()
				.getAttribute("user");
		if (customer == null) {
			System.out.println("未登录");
			response.sendRedirect("/login.jsp");
			return false;
		} else
			return true;
	}
}
