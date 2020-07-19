import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print(number + " ");
        while (number != 1) {
            number = newNumber(number);
            System.out.print(number + " ");
        }

    }

    public static int newNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return n * 3 + 1;
        }
    }
}