package MyPackage;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculation {
	public static void main(String args[]) throws ParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(args[0], formatter);
		LocalDate date = LocalDate.now();
		Period period = Period.between(localDate, date);
		System.out.println(period.getYears() + "years " + period.getMonths() + "months " + period.getDays() + "days");
	}
}
