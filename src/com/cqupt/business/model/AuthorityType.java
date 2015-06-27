package com.cqupt.business.model;

public enum AuthorityType {
	AUTHORITY_SYSTEM('2'), AUTHORITY_SIMPLE('1');
	private int type;

	private AuthorityType(char type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

}
