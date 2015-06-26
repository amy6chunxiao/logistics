package com.cqupt.business.dao;

import java.util.List;

import com.cqupt.business.model.CarMessage;
import com.cqupt.business.model.Enterprise;

public interface EnterpriseDao {
	public List<Enterprise> findAllEnterprise();

	public CarMessage findEnterpriseById(int id);

	public boolean addEnterprise(Enterprise enterprise);

	public boolean deleteEnterprise(int id);

	public boolean batchDeleteEnterprise(int id);

	public boolean changeEnterprise(int id, Enterprise enterprise);
}
