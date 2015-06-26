package com.cqupt.business.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cqupt.business.service.CarMessageService;

@WebServlet(name = "GetCarMessageServlet", urlPatterns = "/servlet/GetCarMessageServlet")
public class GetCarMessageServlet extends HttpServlet {

	private CarMessageService carMessageService;

	@Override
	public void init() throws ServletException {
		super.init();
		ServletContext servletContext = this.getServletContext();
		WebApplicationContext webAppcontext = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		carMessageService = webAppcontext.getBean(CarMessageService.class);
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(carMessageService.findAllCarMessage());
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
