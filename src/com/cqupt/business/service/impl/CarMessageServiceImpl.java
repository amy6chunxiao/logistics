package com.cqupt.business.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.cqupt.business.dao.CarMessageDao;
import com.cqupt.business.model.CarMessage;
import com.cqupt.business.service.CarMessageService;

@Service("carMessageService")
public class CarMessageServiceImpl implements CarMessageService {
	@Resource
	private CarMessageDao carMessageDao;

	@Resource(name = "carMessageDao")
	public void setCarMessageDao(CarMessageDao carMessageDao) {
		this.carMessageDao = carMessageDao;
	}

	@Override
	public List<CarMessage> findAllCarMessage() {
		return carMessageDao.findAllCarMessage();
	}

	@Override
	public CarMessage findCarMessageById(int id) {
		return carMessageDao.findCarMessageById(id);
	}

	@Override
	public boolean addCarMessage(CarMessage carMessage) {
		return carMessageDao.addCarMessage(carMessage) != 0;
	}

	@Override
	public boolean deleteCarMessage(int id) {
		return carMessageDao.deleteCarMessage(id) != 0;
	}

	@Override
	public boolean batchDeleteCarMessage(int id) {
		return carMessageDao.batchDeleteCarMessage(id) != 0;
	}

	@Override
	public boolean changeCarMessage(int id, CarMessage carMessage) {
		return carMessageDao.changeCarMessage(id, carMessage) != 0;
	}

	// public static void main(String[] args) {
	// ApplicationContext ac = new ClassPathXmlApplicationContext(
	// "/WEB-INF/applicationContext.xml");
	// CarMessageService carMessageService = (CarMessageService) ac
	// .getBean("carMessageService");
	// carMessageService.deleteCarMessage(1);
	// }

}
