package introduction;

public class SimpleTypes {

    public static void main(String[] args) {
        int age;
        age = 0;
        System.out.println("Wiek to " + age);

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana w lotto to " + lottoReward);

        short dayOfMonth = 29;
        System.out.println("Dzień miesiąca to " + dayOfMonth);
        dayOfMonth = 23;
        System.out.println("Dzień miesiąca to " + dayOfMonth);

        final float PI_PI = 3.14F;
        System.out.println("Liczba PI to " + PI_PI);

        boolean isPaid = false;
        String isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("Czy zapłacono rachunek? " + isPaidTxt);
        isPaid = true;
        isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("A może teraz już zapłacono? " + isPaidTxt);

        int index = 1;
        String name = "Andrzej";
        char aLetter = name.charAt(index);

        System.out.println((index + 1) + " literka w imieniu " + name + " to " + aLetter);

        String prefix = "An";
        boolean isStartingWith = name.startsWith(prefix);
        System.out.println("Czy imię " + name + " zaczyna się od " + prefix + "? : " + isStartingWith);
    }

}
