package com.cqupt.business.service;

import java.util.List;

import com.cqupt.business.model.GoodsMessage;

public interface GoodsMessageService {
	public List<GoodsMessage> findAllGoodsMessage();

	public GoodsMessage findGoodsMessageById(int id);

	public boolean addGoodsMessage(GoodsMessage goodsMessage);

	public boolean deleteGoodsMessage(int id);

	public boolean batchDeleteGoodsMessage(List<Integer> ids);

	public boolean changeGoodsMessage(int id, GoodsMessage goodsMessage);
}
