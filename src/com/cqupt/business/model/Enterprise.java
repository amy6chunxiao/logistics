package com.cqupt.business.model;

import java.util.Date;

public class Enterprise {
	private int id;
	private String enterpriseSort;
	private String enterpriseName;
	private String operation;
	private String workArea;
	private String address;
	private String phone;
	private String linkMain;
	private String handSet;
	private String fax;
	private String email;
	private String http;
	private String intro;
	private String issueDate;
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnterpriseSort() {
		return enterpriseSort;
	}

	public void setEnterpriseSort(String enterpriseSort) {
		this.enterpriseSort = enterpriseSort;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getWorkArea() {
		return workArea;
	}

	public void setWorkArea(String workArea) {
		this.workArea = workArea;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLinkMain() {
		return linkMain;
	}

	public void setLinkMain(String linkMain) {
		this.linkMain = linkMain;
	}

	public String getHandSet() {
		return handSet;
	}

	public void setHandSet(String handSet) {
		this.handSet = handSet;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHttp() {
		return http;
	}

	public void setHttp(String http) {
		this.http = http;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((enterpriseName == null) ? 0 : enterpriseName.hashCode());
		result = prime * result
				+ ((enterpriseSort == null) ? 0 : enterpriseSort.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((handSet == null) ? 0 : handSet.hashCode());
		result = prime * result + ((http == null) ? 0 : http.hashCode());
		result = prime * result + id;
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
		result = prime * result
				+ ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result
				+ ((linkMain == null) ? 0 : linkMain.hashCode());
		result = prime * result
				+ ((operation == null) ? 0 : operation.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((workArea == null) ? 0 : workArea.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enterprise other = (Enterprise) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enterpriseName == null) {
			if (other.enterpriseName != null)
				return false;
		} else if (!enterpriseName.equals(other.enterpriseName))
			return false;
		if (enterpriseSort == null) {
			if (other.enterpriseSort != null)
				return false;
		} else if (!enterpriseSort.equals(other.enterpriseSort))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (handSet == null) {
			if (other.handSet != null)
				return false;
		} else if (!handSet.equals(other.handSet))
			return false;
		if (http == null) {
			if (other.http != null)
				return false;
		} else if (!http.equals(other.http))
			return false;
		if (id != other.id)
			return false;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		if (linkMain == null) {
			if (other.linkMain != null)
				return false;
		} else if (!linkMain.equals(other.linkMain))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (workArea == null) {
			if (other.workArea != null)
				return false;
		} else if (!workArea.equals(other.workArea))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", enterpriseSort=" + enterpriseSort
				+ ", enterpriseName=" + enterpriseName + ", operation="
				+ operation + ", workArea=" + workArea + ", address=" + address
				+ ", phone=" + phone + ", linkMain=" + linkMain + ", handSet="
				+ handSet + ", fax=" + fax + ", email=" + email + ", http="
				+ http + ", intro=" + intro + ", issueDate=" + issueDate
				+ ", userName=" + userName + "]";
	}
}
