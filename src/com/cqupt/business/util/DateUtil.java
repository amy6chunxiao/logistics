package com.cqupt.business.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static Date getCurrentDate() {
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH);
		int d = c.get(Calendar.DATE);
		String date = y + "-" + m + "-" + d;
		return null;
	}
}
