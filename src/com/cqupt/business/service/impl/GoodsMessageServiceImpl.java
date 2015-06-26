package com.cqupt.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqupt.business.dao.GoodsMessageDao;
import com.cqupt.business.model.GoodsMessage;
import com.cqupt.business.service.GoodsMessageService;

@Service("goodsMessageService")
public class GoodsMessageServiceImpl implements GoodsMessageService {

	@Resource
	private GoodsMessageDao goodsMessageDao;

	@Resource(name = "goodsMessageDao")
	public void setGoodsMessageDao(GoodsMessageDao goodsMessageDao) {
		this.goodsMessageDao = goodsMessageDao;
	}

	@Override
	public List<GoodsMessage> findAllGoodsMessage() {
		return goodsMessageDao.findAllGoodsMessage();
	}

	@Override
	public GoodsMessage findGoodsMessageById(int id) {
		return goodsMessageDao.findGoodsMessageById(id);
	}

	@Override
	public boolean addGoodsMessage(GoodsMessage goodsMessage) {
		return goodsMessageDao.addGoodsMessage(goodsMessage)!=0;
	}

	@Override
	public boolean deleteGoodsMessage(int id) {
		return goodsMessageDao.deleteGoodsMessage(id)!=0;
	}

	@Override
	public boolean batchDeleteGoodsMessage(int id) {
		return goodsMessageDao.batchDeleteGoodsMessage(id)!=0;
	}

	@Override
	public boolean changeGoodsMessage(int id, GoodsMessage goodsMessage) {
		return goodsMessageDao.changeGoodsMessage(id, goodsMessage)!=0;
	}

}
