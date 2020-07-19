import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
                result++;
            }
        }

        System.out.println(result);
    }
}