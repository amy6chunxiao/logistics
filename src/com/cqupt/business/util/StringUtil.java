package com.cqupt.business.util;

public class StringUtil {
	public static boolean isNull(String str) {
		if (str == null || str.equals(""))
			return true;
		else
			return false;
	}
}
