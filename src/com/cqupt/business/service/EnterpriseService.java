package com.cqupt.business.service;

import java.util.List;

import com.cqupt.business.model.CarMessage;
import com.cqupt.business.model.Enterprise;

public interface EnterpriseService {
	public List<Enterprise> findAllEnterprise();

	public CarMessage findEnterpriseById(int id);

	public boolean addEnterprise(Enterprise enterprise);

	public boolean deleteEnterprise(int id);

	public boolean batchDeleteEnterprise(List<Integer> ids);

	public boolean changeEnterprise(int id, Enterprise enterprise);
}
