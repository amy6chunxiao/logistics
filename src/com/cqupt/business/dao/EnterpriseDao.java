package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.CarMessage;
import com.cqupt.business.model.Enterprise;

public interface EnterpriseDao {
	public List<Enterprise> findAllEnterprise();

	public CarMessage findEnterpriseById(int id);

	public int addEnterprise(Enterprise enterprise);

	public int deleteEnterprise(int id);

	public int batchDeleteEnterprise(List<Integer> ids);

	public int changeEnterprise(int id, Enterprise enterprise);
}
