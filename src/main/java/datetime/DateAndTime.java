package datetime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Aktualny data i czas: " + currentTime);
        System.out.println("Dziś jest " + currentTime.getDayOfYear() + " dzień roku");

        String someDate = "2010/03/23 20:34";
        String format = "yyyy/MM/dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime someDateParsed = LocalDateTime.parse(someDate, formatter);

        System.out.println("Jakaś data to: " + someDateParsed);
        System.out.println("Czy teraz jest przed jakąś 2010/03/23?" + currentTime.isBefore(someDateParsed));

        Period period = Period.between(someDateParsed.toLocalDate(), currentTime.toLocalDate());
        int yearsBetweenTwoDates = period.getYears();
        System.out.println("Różnica w latach: " + yearsBetweenTwoDates);

    }

}
