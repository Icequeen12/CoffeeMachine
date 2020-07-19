import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        if (amount < 1) {
            System.out.println("no army");
        } else if (amount >= 1 && amount <= 19) {
            System.out.println("pack");
        } else if (amount >= 20 && amount <= 249) {
            System.out.print("throng");
        } else if (amount >= 250 && amount <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}