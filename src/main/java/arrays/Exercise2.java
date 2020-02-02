package arrays;

public class Exercise2 {

    public static void main(String[] args) {
        String [] names = new String [] {
                "Ala",
                "Ola",
                "Andrzej",
                "Brunhilda",
                "Genowefa",
                "Bożydar",
                "Gniewomir",
                "Sławomir",
                "Mścisław",
                "Stanisław",
                "Bronisław",
                "Wiercisław",
                "Wendzisław",
                "Petronela",
                "Kunegunda"
        };
        /*
        Zad 1: wypisz imiona żeńskie
        Zad 2: wypisz imiona żeńskie nie dłuższe niż 3 znaki
        Zad 3: wypisz imiona słowiańskie (kończą się na "sław" lub "mir")
        Zad 3: znajdź najdłuższe imię
         */

//        String newLine = System.lineSeparator();
//        String multilineString = "Ala ma kota" + newLine + "A kot ma mleko" + newLine + "A myszka zbiła jajeczko";
//        System.out.println(multilineString);

        int longestNameLength = 0;
        for (String name: names) {
            if (longestNameLength < name.length()) {
                longestNameLength = name.length();
            }
        }
        for (String name: names) {
            if (longestNameLength == name.length()) {
                System.out.println(name);
            }
        }

        System.out.println("########################");

        for (String name : names) {
            if (name.endsWith("mir")) {
                break;
            }
            System.out.println(name);
        }
    }

}
