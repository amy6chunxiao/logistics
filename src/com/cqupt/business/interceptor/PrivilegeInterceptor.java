package com.cqupt.business.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cqupt.business.annotation.FireAuthority;

public class PrivilegeInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		FireAuthority fireAuthority = handlerMethod
				.getMethodAnnotation(FireAuthority.class);

		if (null == fireAuthority) {
			return true;
		}
		HttpSession session = request.getSession();
		char pow = (Character) session.getAttribute("pow");
		if (pow >= fireAuthority.authorityType().getType()) {
			return true;
		} else {
			System.out.println("权限不够");
			response.sendRedirect("../login.jsp");
			return false;
		}
	}

}
