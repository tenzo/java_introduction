package arrays;

public class Exercise {

    public static void main(String[] args) {
        int [] numbers = new int [] {23, 34,12,34, 543, 54,65,764,34,23,12,34,34,45,23,23,3456};
        // znajdź maksymalną i minimalną wartość w tablicy

        int max = Integer.MIN_VALUE;
        max = numbers[0];
        int min = Integer.MAX_VALUE;
        min = numbers[0];
        double mean = 0.0D;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
            mean += numbers[i];
        }
        mean /= numbers.length;
        System.out.println("Min: " + min + ", max: " + max + ", mean: " + mean);

        for (int elem: numbers) {
            if (elem % 3 == 0) {
                System.out.println(elem + " jest podzielny przez 3");
            }
        }

    }














}
