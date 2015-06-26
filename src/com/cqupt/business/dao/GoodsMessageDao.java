package com.cqupt.business.dao;

import java.util.List;
import com.cqupt.business.model.GoodsMessage;

public interface GoodsMessageDao {
	public List<GoodsMessage> findAllGoodsMessage();

	public GoodsMessage findGoodsMessageById(int id);

	public int addGoodsMessage(GoodsMessage goodsMessage);

	public int deleteGoodsMessage(int id);

	public int batchDeleteGoodsMessage(List<Integer> ids);

	public int changeGoodsMessage(int id, GoodsMessage goodsMessage);
}
