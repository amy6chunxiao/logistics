package com.cqupt.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqupt.business.dao.KnowledgeDao;
import com.cqupt.business.model.Knowledge;
import com.cqupt.business.service.KnowledgeService;

@Service("knowledgeService")
public class KnowledgeServiceImpl implements KnowledgeService {

	@Resource
	private KnowledgeDao knowledgeDao;

	@Resource(name = "knowledgeDao")
	public void setKnowledgeDao(KnowledgeDao knowledgeDao) {
		this.knowledgeDao = knowledgeDao;
	}

	@Override
	public List<Knowledge> findAllKnowledge() {
		return knowledgeDao.findAllKnowledge();
	}

	@Override
	public Knowledge findKnowledgeById(int id) {
		return knowledgeDao.findKnowledgeById(id);
	}

	@Override
	public boolean addKnowledge(Knowledge knowledge) {
		return knowledgeDao.addKnowledge(knowledge) != 0;
	}

	@Override
	public boolean deleteKnowledge(int id) {
		return knowledgeDao.deleteKnowledge(id) != 0;
	}

	@Override
	public boolean batchDeleteKnowledge(int id) {
		return knowledgeDao.batchDeleteKnowledge(id) != 0;
	}

	@Override
	public boolean changeKnowledge(int id, Knowledge knowledge) {
		return knowledgeDao.changeKnowledge(id, knowledge) != 0;
	}

}
