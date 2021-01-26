import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataEHora {
	public static void main(String[] args) {
		
		//LocalDate - indicates the actual date of the machine
		LocalDate ldNow = LocalDate.now();
		System.out.println(ldNow);
		LocalDate.of(2021, Month.JANUARY, 26);
		LocalDate ld = ldNow.plusWeeks(2).plusDays(1);
		System.out.println(ld);
		
		
		//LocalTime - indicates the hour at the local machine
		LocalTime ltNow = LocalTime.now(); 
		System.out.println(ltNow);
		
		
		
		//LocalDateTime - indicates the date+hour of the machine
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow);
		LocalDateTime ldt = LocalDateTime.of(ldNow, ltNow);
		
		
		
		// Instant - represents an instant/moment since 01/01/1970
		// GMT/UTC
		Instant iNow = Instant.now();
		System.out.println(iNow);
		Instant i = Instant.ofEpochMilli(5000000000L);
		System.out.println(i);
		ZoneId zoneId = ZoneId.of("America/Montevideo");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId); 
		System.out.println(zdt);
		
	}
}
