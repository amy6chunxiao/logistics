package com.cqupt.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqupt.business.dao.EnterpriseDao;
import com.cqupt.business.model.CarMessage;
import com.cqupt.business.model.Enterprise;
import com.cqupt.business.service.EnterpriseService;

@Service("enterpriseService")
public class EnterpriseServiceImpl implements EnterpriseService {

	@Resource
	private EnterpriseDao enterpriseDao;

	@Resource(name="enterpriseDao")
	public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}

	@Override
	public List<Enterprise> findAllEnterprise() {
		return enterpriseDao.findAllEnterprise();
	}

	@Override
	public CarMessage findEnterpriseById(int id) {
		return enterpriseDao.findEnterpriseById(id);
	}

	@Override
	public boolean addEnterprise(Enterprise enterprise) {
		return enterpriseDao.addEnterprise(enterprise)!=0;
	}

	@Override
	public boolean deleteEnterprise(int id) {
		return enterpriseDao.deleteEnterprise(id)!=0;
	}

	@Override
	public boolean batchDeleteEnterprise(int id) {
		return enterpriseDao.batchDeleteEnterprise(id)!=0;
	}

	@Override
	public boolean changeEnterprise(int id, Enterprise enterprise) {
		return enterpriseDao.changeEnterprise(id, enterprise)!=0;
	}

}
