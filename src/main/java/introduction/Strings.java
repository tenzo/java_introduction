package introduction;

public class Strings {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        String text2 = "Ala ma kota";

        System.out.println("Text1: " + text + ", text2: " + text2);
        System.out.println("Czy obie zmienne to to samo? " + text.equals(text2));

        // 1. Utwórz String "Ala ma kota" używając StringBuildera i metody append.
        StringBuilder builder = new StringBuilder();
        builder.append("Ala ");
        builder.append("ma ");
        builder.append(2);
        builder.append(" koty");
        String resultText = builder.toString();
        System.out.println("Napis utworzony przez buildera: " + resultText);

    }

}
