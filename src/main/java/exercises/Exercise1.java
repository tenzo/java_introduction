package exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        User user = new User();

        int nameLength = user.getName().length();
        //                       String      String          String         int
        int something = (((user.getName()).toLowerCase()).concat("Hello")).length();
        int something2 = user.getName().toLowerCase().concat("Hello").length();

        //zad 4
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] data = line.split(" ");
        /*
            wejście -> "Adam Nowak 23"
            {"Adam", "Nowak", "23"}
            String name = data[0];
            String lastname = data[1];
            int age = Integer.valueOf(data[2]);
         */

    }
}
