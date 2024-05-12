import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Function {

    public static void main(String[] args) {
        String fileName = "data.txt";
        try {
            int[] numbers = readNumbersFromFile(fileName);
            System.out.println("Минимальное: " + _min(numbers));
            System.out.println("Максимальное: " + _max(numbers));
            System.out.println("Сумма: " + _sum(numbers));
            System.out.println("Произведение: " + _mult(numbers));
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    public static int[] readNumbersFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        reader.close();
        return numbers;
    }

    public static int _min(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static long _mult(int[] numbers) {
        long product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}
