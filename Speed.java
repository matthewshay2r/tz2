import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Speed {

    private static final int[] FILE_SIZES = {100, 1000, 10_000, 50_000, 100_000, 500_000, 1_000_000,5_000_000, 10_000_000};
    private static final long[] minTimes = new long[FILE_SIZES.length];
    private static final long[] maxTimes = new long[FILE_SIZES.length];
    private static final long[] sumTimes = new long[FILE_SIZES.length];
    private static final long[] multTimes = new long[FILE_SIZES.length];

    public static void main(String[] args) {
        for (int i = 0; i < FILE_SIZES.length; i++) {
            int size = FILE_SIZES[i];
            createTestFile(size);
            System.out.println("File with " + size + " numbers created.");
            minTimes[i] = testMin(size);
            maxTimes[i] = testMax(size);
            sumTimes[i] = testSum(size);
            multTimes[i] = testProduct(size);
            System.out.println("Min: " + minTimes[i] +" ms");
            System.out.println("Max: " + maxTimes[i] +" ms");
            System.out.println("Sum: " + sumTimes[i] +" ms");
            System.out.println("Mult: " + multTimes[i] +" ms");
            System.out.println();
        }

    }

    private static void createTestFile(int size) {
        try {
            FileWriter writer = new FileWriter("speeddata/testfile.txt");
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                writer.write(random.nextInt(1000) + " ");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long testMin(int size) {
        long startTime = System.currentTimeMillis();
        try {
            int[] numbers = Function.readNumbersFromFile("speeddata/testfile.txt");
            Function._min(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testMax(int size) {
        long startTime = System.currentTimeMillis();
        try {
            int[] numbers = Function.readNumbersFromFile("speeddata/testfile.txt");
            Function._max(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testSum(int size) {
        long startTime = System.currentTimeMillis();
        try {
            int[] numbers = Function.readNumbersFromFile("speeddata/testfile.txt");
            Function._sum(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testProduct(int size) {
        long startTime = System.currentTimeMillis();
        try {
            int[] numbers = Function.readNumbersFromFile("speeddata/testfile.txt");
            Function._mult(numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
