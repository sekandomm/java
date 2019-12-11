package chapter4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DaysTillNextMonth {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");
		LocalDate yer = LocalDate.of(2019, 10, 12);
		System.out.println("Days until the next month: "+(yer.lengthOfMonth()-yer.getDayOfMonth()));
		System.out.println("Next Month is: "+yer.plusMonths(1).format(formatter));
	}
}