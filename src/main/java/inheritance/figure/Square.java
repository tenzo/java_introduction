package inheritance.figure;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
