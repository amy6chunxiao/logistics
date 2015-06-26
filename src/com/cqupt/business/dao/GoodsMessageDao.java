package com.cqupt.business.dao;

import java.util.List;
import com.cqupt.business.model.GoodsMessage;

public interface GoodsMessageDao {
	public List<GoodsMessage> findAllGoodsMessage();

	public GoodsMessage findGoodsMessageById(int id);

	public boolean addGoodsMessage(GoodsMessage goodsMessage);

	public boolean deleteGoodsMessage(int id);

	public boolean batchDeleteGoodsMessage(int id);

	public boolean changeGoodsMessage(int id, GoodsMessage goodsMessage);
}
