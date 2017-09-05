package poroLink.utils.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
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
	
	public static java.sql.Date setMySqlDate(Date date) {
		if (date != null) {
			Long s = date.getTime();
			return new java.sql.Date(s);
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
