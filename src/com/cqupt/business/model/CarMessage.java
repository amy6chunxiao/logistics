package com.cqupt.business.model;

import java.util.Date;

public class CarMessage {

	private int code;
	private String tradeMark;
	private String drand;
	private String style;
	private String carLoad;
	private String usedTime;
	private String driverName;
	private String driverTime;
	private String licenceNumber;
	private String licenceStyle;
	private String transpotStyle;
	private String linkMain;
	private String linkPhone;
	private String remark;
	private Date issueDate;
	private String username;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTradeMark() {
		return tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	public String getDrand() {
		return drand;
	}

	public void setDrand(String drand) {
		this.drand = drand;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCarLoad() {
		return carLoad;
	}

	public void setCarLoad(String carLoad) {
		this.carLoad = carLoad;
	}

	public String getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverTime() {
		return driverTime;
	}

	public void setDriverTime(String driverTime) {
		this.driverTime = driverTime;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getLicenceStyle() {
		return licenceStyle;
	}

	public void setLicenceStyle(String licenceStyle) {
		this.licenceStyle = licenceStyle;
	}

	public String getTranspotStyle() {
		return transpotStyle;
	}

	public void setTranspotStyle(String transpotStyle) {
		this.transpotStyle = transpotStyle;
	}

	public String getLinkMain() {
		return linkMain;
	}

	public void setLinkMain(String linkMain) {
		this.linkMain = linkMain;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carLoad == null) ? 0 : carLoad.hashCode());
		result = prime * result + code;
		result = prime * result + ((drand == null) ? 0 : drand.hashCode());
		result = prime * result
				+ ((driverName == null) ? 0 : driverName.hashCode());
		result = prime * result
				+ ((driverTime == null) ? 0 : driverTime.hashCode());
		result = prime * result
				+ ((issueDate == null) ? 0 : issueDate.hashCode());
		result = prime * result
				+ ((licenceNumber == null) ? 0 : licenceNumber.hashCode());
		result = prime * result
				+ ((licenceStyle == null) ? 0 : licenceStyle.hashCode());
		result = prime * result
				+ ((linkMain == null) ? 0 : linkMain.hashCode());
		result = prime * result
				+ ((linkPhone == null) ? 0 : linkPhone.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result
				+ ((tradeMark == null) ? 0 : tradeMark.hashCode());
		result = prime * result
				+ ((transpotStyle == null) ? 0 : transpotStyle.hashCode());
		result = prime * result
				+ ((usedTime == null) ? 0 : usedTime.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		CarMessage other = (CarMessage) obj;
		if (carLoad == null) {
			if (other.carLoad != null)
				return false;
		} else if (!carLoad.equals(other.carLoad))
			return false;
		if (code != other.code)
			return false;
		if (drand == null) {
			if (other.drand != null)
				return false;
		} else if (!drand.equals(other.drand))
			return false;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		if (driverTime == null) {
			if (other.driverTime != null)
				return false;
		} else if (!driverTime.equals(other.driverTime))
			return false;
		if (issueDate == null) {
			if (other.issueDate != null)
				return false;
		} else if (!issueDate.equals(other.issueDate))
			return false;
		if (licenceNumber == null) {
			if (other.licenceNumber != null)
				return false;
		} else if (!licenceNumber.equals(other.licenceNumber))
			return false;
		if (licenceStyle == null) {
			if (other.licenceStyle != null)
				return false;
		} else if (!licenceStyle.equals(other.licenceStyle))
			return false;
		if (linkMain == null) {
			if (other.linkMain != null)
				return false;
		} else if (!linkMain.equals(other.linkMain))
			return false;
		if (linkPhone == null) {
			if (other.linkPhone != null)
				return false;
		} else if (!linkPhone.equals(other.linkPhone))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		if (tradeMark == null) {
			if (other.tradeMark != null)
				return false;
		} else if (!tradeMark.equals(other.tradeMark))
			return false;
		if (transpotStyle == null) {
			if (other.transpotStyle != null)
				return false;
		} else if (!transpotStyle.equals(other.transpotStyle))
			return false;
		if (usedTime == null) {
			if (other.usedTime != null)
				return false;
		} else if (!usedTime.equals(other.usedTime))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarMessage [code=" + code + ", tradeMark=" + tradeMark
				+ ", drand=" + drand + ", style=" + style + ", carLoad="
				+ carLoad + ", usedTime=" + usedTime + ", driverName="
				+ driverName + ", driverTime=" + driverTime
				+ ", licenceNumber=" + licenceNumber + ", licenceStyle="
				+ licenceStyle + ", transpotStyle=" + transpotStyle
				+ ", linkMain=" + linkMain + ", linkPhone=" + linkPhone
				+ ", remark=" + remark + ", issueDate=" + issueDate
				+ ", username=" + username + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
