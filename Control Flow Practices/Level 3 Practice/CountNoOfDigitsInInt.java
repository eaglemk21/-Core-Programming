public class CountNoOfDigitsInInt {
    public static void main(String[] args) {
        int number = 123456789;
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
