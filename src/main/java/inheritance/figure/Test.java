package inheritance.figure;

public class Test {

    public static void main(String[] args) {
        Figure [] figures = new Figure [] {
                new Circle(4.5D),
                new Square(5.6D),
                new Triangle(3.4D, 5.5),
                new Circle(6.7D),
                new Circle(2.2D)
        };
        double sum = 0.0D;
        for (Figure figure :
                figures) {
            sum += figure.area();
            System.out.println("Figura " + figure + " ma powierzchnię " + figure.area());
        }

        System.out.println("Suma powierzchni to " + sum);

    }
}
