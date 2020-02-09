package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {
        LocalDate currentTime = LocalDate.now();

        System.out.println("Aktualny data i czas: " + currentTime);
        System.out.println("Dziś jest " + currentTime.getDayOfYear() + " dzień roku");

        String someDate = "2010/03/23";
        String format = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate someDateParsed = LocalDate.parse(someDate, formatter);

        System.out.println("Jakaś data to: " + someDateParsed);
        System.out.println("Czy teraz jest przed jakąś 2010/03/23?" + currentTime.isBefore(someDateParsed));

        Period period = Period.between(someDateParsed, currentTime);
        int yearsBetweenTwoDates = period.getYears();
        System.out.println("Różnica w latach: " + yearsBetweenTwoDates);

    }

}
