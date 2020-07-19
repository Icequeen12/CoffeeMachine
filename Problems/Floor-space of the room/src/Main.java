import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        switch (figure) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double half = (a + b + c) * 0.5;
                System.out.println(Math.sqrt(half * (half - a) * (half - b) * (half - c)));
                break;

            case "rectangle":
                double aa = scanner.nextDouble();
                double bb = scanner.nextDouble();
                System.out.println(aa * bb);
                break;

            case "circle":
                double r = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));

        }
    }
}