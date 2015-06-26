package com.cqupt.business.service;

import java.util.List;

import com.cqupt.business.model.CarMessage;

public interface CarMessageService {
	public List<CarMessage> findAllCarMessage();

	public CarMessage findCarMessageById(int id);

	public boolean addCarMessage(CarMessage carMessage);

	public boolean deleteCarMessage(int id);

	public boolean batchDeleteCarMessage(List<Integer> ids);

	public boolean changeCarMessage(int id, CarMessage carMessage);
}
