package IntegerCalculator;

import java.util.ArrayList;

public class IntegerCalculator {

    public int add(int x, int y) {
        int sum = x + y;
        System.out.println("sum is " + sum);
        return sum;
    }

    public int addAll(ArrayList<Integer> integers) {
        int sum = 0;

        sum = integers.stream()
                .map(x -> x.intValue())
                .reduce(0, Integer::sum);
        System.out.println("sum is " + sum);
        return sum;
    }

    public int subtract(int x, int y) {
        int difference = x - y;
        System.out.println("difference is " + difference);
        return difference;
    }

    public int subtractAll(ArrayList<Integer> integers) {
        int firstVal = integers.get(0) * 2;

        int difference = integers.stream()
                .map(x -> x.intValue())
                .reduce(firstVal, (x, y) -> subtract(x, y));
        System.out.println("difference is " + difference);
        return difference;
    }

    public int multiply(int x, int y) {
        int product = x * y;
        System.out.println("product is " + product);
        return product;
    }

    public int multiplyAll(ArrayList<Integer> integers) {
        int product = 1;

        product = integers.stream()
                .map(x -> x.intValue())
                .reduce(product, (x, y) -> multiply(x, y));
        System.out.println("product is " + product);
        return product;
    }

    public int divide(int x, int y) {
        int quotient = x / y;
        System.out.println("quotient is " + quotient);
        return quotient;
    }

    public int divideAll(ArrayList<Integer> integers) {
        int quotient = (int) Math.pow(integers.get(0), 2);

        for (Integer x : integers) {
            quotient /= x;
        }
        System.out.println("quotient is " + quotient);

        return quotient;
    }

    public String print(String message) {
        return message;
    }
}
