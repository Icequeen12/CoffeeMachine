import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        StringBuilder sb = new StringBuilder(String.valueOf(number));

        while (sb.length() < 4) {
            sb.insert(0, "0");
        }

        if (sb.charAt(0) == sb.charAt(3) && sb.charAt(1) == sb.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}