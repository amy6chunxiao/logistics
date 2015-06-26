package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.GoodsMessage;
import com.cqupt.business.model.Knowledge;

public interface KnowledgeDao {
	public List<Knowledge> findAllKnowledge();

	public Knowledge findKnowledgeById(int id);

	public boolean addKnowledge(Knowledge knowledge);

	public boolean deleteKnowledge(int id);

	public boolean batchDeleteKnowledge(int id);

	public boolean changeKnowledge(int id, Knowledge knowledge);
}
