package com.cqupt.business.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cqupt.business.util.StringUtil;

public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();

		String path = servletRequest.getRequestURI();
		String username = (String) session.getAttribute("username");

		if (path.indexOf("/login.jsp") > -1 || path.indexOf("/index.jsp") > -1
				|| path.indexOf("/login.action") > -1
				|| path.indexOf("logout.action") > -1
				|| path.indexOf("register.jsp") > -1) {
			chain.doFilter(servletRequest, servletResponse);
			return;
		}
		if (path.indexOf(".jsp") > -1 || path.indexOf(".action") > -1) {
			if (StringUtil.isNull(username)) {
				servletResponse.sendRedirect("./login.jsp");
			} else
				chain.doFilter(request, response);
		} else {
			chain.doFilter(request, response);
			return;
		}
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
