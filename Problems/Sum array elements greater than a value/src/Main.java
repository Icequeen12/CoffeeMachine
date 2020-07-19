import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        for (int i : numbers) {
            if (i > n) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}