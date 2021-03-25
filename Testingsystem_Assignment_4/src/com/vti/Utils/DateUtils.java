package com.vti.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DateUtils {
	public Date stringToDate(String sdate) throws ParseException {
    	Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sdate);
    	return date;
	}
	public String dateToString(Date date) {
    	String pattern = "dd/MM/yy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date2 = simpleDateFormat.format(date);
        return date2;
    }
}
