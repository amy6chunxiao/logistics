package com.cqupt.business.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cqupt.business.service.CarMessageService;

@Controller
public class CarMessageController {
	@Resource
	private CarMessageService carMessageService;

	@RequestMapping(value = "/carMessage/hello", method = RequestMethod.GET)
	public String findAllCarMessage() {
		System.out.println("hahah");
		return null;
	}
}
