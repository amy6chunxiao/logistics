package com.cqupt.business.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.cqupt.business.model.CarMessage;
import com.cqupt.business.service.CarMessageService;

@Controller
@RequestMapping(value = "/carMessage")
public class CarMessageController {
	@Resource
	private CarMessageService carMessageService;

	@Resource(name = "carMessageService")
	public void setCarMessageService(CarMessageService carMessageService) {
		this.carMessageService = carMessageService;
	}

	@RequestMapping(value = "/getAll")
	public String findAllCarMessage(HttpServletRequest request) {
		carMessageService.findAllCarMessage();
		return "/start.jsp";
	}

	@RequestMapping(value = "/getById")
	public @ResponseBody
	JSONObject findCarMessageById(int id) {
		CarMessage carMessage = carMessageService.findCarMessageById(id);
		JSONObject jsonObject = (JSONObject) JSONObject.toJSON(carMessage);
		return jsonObject;
	}

	@RequestMapping(value = "/add")
	public String addCarMessage(HttpServletRequest request) {
		String str = request.getParameter("");
		CarMessage carMessage = (CarMessage) JSONObject.parse(str);
		carMessageService.addCarMessage(carMessage);
		return null;
	}

	@RequestMapping(value = "/delete")
	public String deleteCarMessage(HttpServletRequest request) {
		String str = request.getParameter("");
		JSONObject jsonObject = JSONObject.parseObject(str);
		int id = jsonObject.getIntValue("id");
		carMessageService.deleteCarMessage(id);
		return null;
	}

	@RequestMapping(value = "/batchDelete")
	public String batchDeleteCarMessage(HttpServletRequest request) {
		String str = request.getParameter("");
		JSONObject jsonObject = JSONObject.parseObject(str);
		List<Integer> ids = null;
		carMessageService.batchDeleteCarMessage(ids);
		return null;
	}

	@RequestMapping(value = "/update")
	public String changeKnowledge(HttpServletRequest request) {
		String str = request.getParameter("");
		JSONObject jsonObject = JSONObject.parseObject(str);
		int id = 0;
		CarMessage carMessage = null;
		carMessageService.changeCarMessage(id, carMessage);
		return null;
	}

}
