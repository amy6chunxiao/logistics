package com.cqupt.business.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cqupt.business.service.CarMessageService;

@Controller
@RequestMapping(value="/carMessage")
public class CarMessageController {
	@Resource
	private CarMessageService carMessageService;

	@RequestMapping(value = "/add")
	public String findAllCarMessage(HttpServletRequest request) {
		System.out.println(request.getParameter("username"));
		return "/start.jsp";
	}
}
