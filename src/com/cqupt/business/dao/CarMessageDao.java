package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.CarMessage;

public interface CarMessageDao {
	public List<CarMessage> findAllCarMessage();

	public CarMessage findCarMessageById(int id);

	public int addCarMessage(CarMessage carMessage);

	public int deleteCarMessage(int id);

	public int batchDeleteCarMessage(List<Integer> ids);

	public int changeCarMessage(int id, CarMessage carMessage);
}
