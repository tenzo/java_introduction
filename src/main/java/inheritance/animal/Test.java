package inheritance.animal;

public class Test {

    public static void main(String[] args) {
        Lion simba = new Lion("Simba", 3);
        simba.voice();

        Horse tomek = new Horse("Tomek", 5, 9);
        tomek.ride(10);

        Animal animal2 = new Lion("Zdzisiek", 6);
        Animal animal3 = new Horse("Antek", 7, 9);

        System.out.println("#####################");
        Animal [] zoo = new Animal [] {simba, tomek, animal2, animal3};
        for (Animal ani : zoo) {
            ani.voice();
        }

    }
}
