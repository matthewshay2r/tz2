public class test {

    public static void main(String[] args) {
        testMin();
        testMax();
        testSum();
        testMult();
    }

    public static void testMin() {
        int[] numbers = {2,4,7,3};
        int expected = 2;
        int result = Function._min(numbers);
        if (expected == result) {
            System.out.println("Min: Passed");
        } else {
            System.out.println("Min: Failed. Expected " + expected + ", but got " + result);
        }
    }

    public static void testMax() {
        int[] numbers = {2,4,7,3};
        int expected = 7;
        int result = Function._max(numbers);
        if (expected == result) {
            System.out.println("Max: Passed");
        } else {
            System.out.println("Max: Failed. Expected " + expected + ", but got " + result);
        }
    }

    public static void testSum() {
        int[] numbers = {2,4,7,3};
        int expected = 16;
        int result = Function._sum(numbers);
        if (expected == result) {
            System.out.println("Sum: Passed");
        } else {
            System.out.println("Sum: Failed. Expected " + expected + ", but got " + result);
        }
    }

    public static void testMult() {
        int[] numbers = {2,4,7,3};
        long expected = 168;
        long result = Function._mult(numbers);
        if (expected == result) {
            System.out.println("Mult: Passed");
        } else {
            System.out.println("Mult: Failed. Expected " + expected + ", but got " + result);
        }
    }
}
