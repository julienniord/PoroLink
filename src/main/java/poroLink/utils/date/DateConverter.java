package poroLink.utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	public static String getMySqlDate(Date date) {
		if (date != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(date);
		} else {
			return null;
		}
	}
	
	public static Date setMySqlDate(Date date) {
		if (date != null) {
			Date sdf = new Date((date.getTime()));
			return sdf;
		} else {
			return null;
		}
	}

	public static String getMySqlDatetime(Date date) {
		if (date != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.format(date);
		} else {
			return null;
		}
	}
}
