package com.cqupt.business.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cqupt.business.dao.CarMessageDao;
import com.cqupt.business.model.CarMessage;
import com.cqupt.business.service.CarMessageService;
import com.cqupt.dbConnection.DBAccess;

public class CarMessageServiceImpl implements CarMessageService {
	private CarMessageDao carMessageDao;

	@Override
	public List<CarMessage> findAllCarMessage() {
		SqlSession sqlSession = null;
		List<CarMessage> cm = new ArrayList<CarMessage>();
		try {

			sqlSession = DBAccess.getSqlSession();
			cm = sqlSession.selectList("carMessageDao.findAllCarMessage");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return cm;
	}

	@Override
	public CarMessage findCarMessageById(int id) {
		SqlSession sqlSession = null;
		CarMessage cm = new CarMessage();
		try {

			sqlSession = DBAccess.getSqlSession();
			cm = sqlSession.selectOne("carMessageDao.findCarMessageById", id);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return cm;
	}

	@Override
	public boolean addCarMessage(CarMessage carMessage) {
		SqlSession sqlSession = null;
		int flag = 0;
		try {
			sqlSession = DBAccess.getSqlSession();
			flag = sqlSession.insert("carMessageDao.addCarMessage", carMessage);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return flag != 0;
	}

	@Override
	public boolean deleteCarMessage(int id) {
		return false;
	}

	@Override
	public boolean batchDeleteCarMessage(int id) {
		return false;
	}

	@Override
	public boolean changeCarMessage(int id, CarMessage carMessage) {
		return false;
	}

	public static void main(String[] args) {
		CarMessageServiceImpl carMessageServiceImpl = new CarMessageServiceImpl();
		carMessageServiceImpl.findAllCarMessage();
	}

}
