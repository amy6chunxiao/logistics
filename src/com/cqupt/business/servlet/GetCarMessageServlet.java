package com.cqupt.business.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cqupt.business.service.CarMessageService;
import com.cqupt.business.service.impl.CarMessageServiceImpl;

@WebServlet(name = "GetCarMessageServlet", urlPatterns = "/servlet/GetCarMessageServlet")
public class GetCarMessageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CarMessageService carMessageService = new CarMessageServiceImpl();
		carMessageService.findAllCarMessage();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
