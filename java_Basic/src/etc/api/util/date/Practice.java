package etc.api.util.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class Practice {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("================");
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime beginDate = localDateTime.of(2022, 7, 1, 9, 0 ,0);
		System.out.println(beginDate);
		
		int year = localDateTime.getYear();
		System.out.println(year);
		
		int dayValue = localDateTime.getDayOfMonth();
		System.out.println(dayValue);
		
		Month monthValue = localDateTime.getMonth();
		System.out.println(monthValue);
		
		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
		System.out.println(dayOfWeek);
		
		System.out.println("=============================");
		
		LocalDateTime returnDate = localDateTime.plusDays(3);
		System.out.println(returnDate);
		
		LocalDateTime d1 = localDateTime.plusYears(1)
										.plusMonths(2)
										.plusDays(7);
		System.out.println(d1);
		
		LocalDateTime d2 = localDateTime.minusMonths(9).minusDays(23);
		System.out.println(d2);
		
	}
}
