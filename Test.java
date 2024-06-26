import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int expectedMin = Integer.parseInt(System.getenv("EXPECTED_MIN"));
        int expectedMax = Integer.parseInt(System.getenv("EXPECTED_MAX"));
        int expectedSum = Integer.parseInt(System.getenv("EXPECTED_SUM"));
        long expectedMult = Long.parseLong(System.getenv("EXPECTED_MULT"));


        String fileName = "data.txt";
        try {
            int[] numbers = Function.readNumbersFromFile(fileName);
            testMin(numbers, expectedMin);
            testMax(numbers, expectedMax);
            testSum(numbers, expectedSum);
            testMult(numbers, expectedMult);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }


    }

    public static void testMin(int[] numbers, int expected) {
        int result = Function._min(numbers);
        if (expected == result) {
            System.out.println("Min: Passed");
        } else {
            System.out.println("Min: Failed. Expected " + expected + ", but got " + result);
        }
    }

    public static void testMax(int[] numbers, int expected) {
        int result = Function._max(numbers);
        if (expected == result) {
            System.out.println("Max: Passed");
        } else {
            System.out.println("Max: Failed. Expected " + expected + ", but got " + result);
        }
    }

    public static void testSum(int[] numbers, int expected) {
        int result = Function._sum(numbers);
        if (expected == result) {
            System.out.println("Sum: Passed");
        } else {
            System.out.println("Sum: Failed. Expected " + expected + ", but got " + result);
        }
    }

    public static void testMult(int[] numbers, long expected) {
        long result = Function._mult(numbers);
        if (expected == result) {
            System.out.println("Mult: Passed");
        } else {
            System.out.println("Mult: Failed. Expected " + expected + ", but got " + result);
        }
    }
}
