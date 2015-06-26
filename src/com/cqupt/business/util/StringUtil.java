package com.cqupt.business.util;

public class StringUtil {
	public static boolean isNull(String str) {
		if (str == null || str.equals(""))
			return true;
		else
			return false;
	}

	public static boolean isEqual(String str1, String str2) {
		if (isNull(str1) || isNull(str2))
			return false;
		else if (str1.equals(str2))
			return true;
		else
			return false;
	}
}
