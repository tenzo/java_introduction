package classes.basics;

public class Test {

    public static void main(String[] args) {
        String nazwisko = "Kowalski";
        User adam = new User("Adam", nazwisko, 17);
//        adam.name = "Adam";
//        adam.lastname = "Kowalski";
//        adam.age = 36;
        System.out.println(adam.name);
        System.out.println(adam.lastname);
        System.out.println(adam.age);

        User jozek = new User("Józek", "Nowak", 45);
        jozek.introduce();

        User cloneJozek = new User(jozek);
        cloneJozek.introduce();
        cloneJozek.name = "Robert";
        cloneJozek.age = 20;
        System.out.println("Po zmianie imienia: ");
        jozek.introduce();
        cloneJozek.introduce();

        System.out.println("Józek: " + jozek + ", Robert: " + cloneJozek);
        System.out.println("#### TEST WIEKU #####");
        System.out.println("Czy Adam jest dorosły? " + adam.isAdult());
        System.out.println("Czy Józek jest dorosły? " + jozek.isAdult());
        System.out.println("Czy Robert jest dorosły? " + cloneJozek.isAdult());
    }

}
