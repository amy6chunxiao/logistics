package com.cqupt.business.model;

import java.util.Date;

public class GoodsMessage {
	private int id;
	private String goodsStyle;
	private String goodsName;
	private String goodsNumber;
	private String goodsUnit;
	private String starProvince;
	private String starCity;
	private String endProvince;
	private String endCity;
	private String style;
	private String transportTime;
	private String phone;
	private String link;
	private String issueDate;
	private String remark;
	private String request;
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsStyle() {
		return goodsStyle;
	}

	public void setGoodsStyle(String goodsStyle) {
		this.goodsStyle = goodsStyle;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public String getStarProvince() {
		return starProvince;
	}

	public void setStarProvince(String starProvince) {
		this.starProvince = starProvince;
	}

	public String getStarCity() {
		return starCity;
	}

	public void setStarCity(String starCity) {
		this.starCity = starCity;
	}

	public String getEndProvince() {
		return endProvince;
	}

	public void setEndProvince(String endProvince) {
		this.endProvince = endProvince;
	}

	public String getEndCity() {
		return endCity;
	}

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTransportTime() {
		return transportTime;
	}

	public void setTransportTime(String transportTime) {
		this.transportTime = transportTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
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
		result = prime * result + ((endCity == null) ? 0 : endCity.hashCode());
		result = prime * result
				+ ((endProvince == null) ? 0 : endProvince.hashCode());
		result = prime * result
				+ ((goodsName == null) ? 0 : goodsName.hashCode());
		result = prime * result
				+ ((goodsNumber == null) ? 0 : goodsNumber.hashCode());
		result = prime * result
				+ ((goodsStyle == null) ? 0 : goodsStyle.hashCode());
		result = prime * result
				+ ((goodsUnit == null) ? 0 : goodsUnit.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((request == null) ? 0 : request.hashCode());
		result = prime * result
				+ ((starCity == null) ? 0 : starCity.hashCode());
		result = prime * result
				+ ((starProvince == null) ? 0 : starProvince.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result
				+ ((transportTime == null) ? 0 : transportTime.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
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
		GoodsMessage other = (GoodsMessage) obj;
		if (endCity == null) {
			if (other.endCity != null)
				return false;
		} else if (!endCity.equals(other.endCity))
			return false;
		if (endProvince == null) {
			if (other.endProvince != null)
				return false;
		} else if (!endProvince.equals(other.endProvince))
			return false;
		if (goodsName == null) {
			if (other.goodsName != null)
				return false;
		} else if (!goodsName.equals(other.goodsName))
			return false;
		if (goodsNumber == null) {
			if (other.goodsNumber != null)
				return false;
		} else if (!goodsNumber.equals(other.goodsNumber))
			return false;
		if (goodsStyle == null) {
			if (other.goodsStyle != null)
				return false;
		} else if (!goodsStyle.equals(other.goodsStyle))
			return false;
		if (goodsUnit == null) {
			if (other.goodsUnit != null)
				return false;
		} else if (!goodsUnit.equals(other.goodsUnit))
			return false;
		if (id != other.id)
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (request == null) {
			if (other.request != null)
				return false;
		} else if (!request.equals(other.request))
			return false;
		if (starCity == null) {
			if (other.starCity != null)
				return false;
		} else if (!starCity.equals(other.starCity))
			return false;
		if (starProvince == null) {
			if (other.starProvince != null)
				return false;
		} else if (!starProvince.equals(other.starProvince))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		if (transportTime == null) {
			if (other.transportTime != null)
				return false;
		} else if (!transportTime.equals(other.transportTime))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GoodsMessage [id=" + id + ", goodsStyle=" + goodsStyle
				+ ", goodsName=" + goodsName + ", goodsNumber=" + goodsNumber
				+ ", goodsUnit=" + goodsUnit + ", starProvince=" + starProvince
				+ ", starCity=" + starCity + ", endProvince=" + endProvince
				+ ", endCity=" + endCity + ", style=" + style
				+ ", transportTime=" + transportTime + ", phone=" + phone
				+ ", link=" + link + ", issueDate=" + issueDate + ", remark="
				+ remark + ", request=" + request + ", userName=" + userName
				+ "]";
	}
}
