package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.Knowledge;

public interface KnowledgeDao {
	public List<Knowledge> findAllKnowledge();

	public Knowledge findKnowledgeById(int id);

	public int addKnowledge(Knowledge knowledge);

	public int deleteKnowledge(int id);

	public int batchDeleteKnowledge(List<Integer> ids);

	public int changeKnowledge(int id, Knowledge knowledge);
}
