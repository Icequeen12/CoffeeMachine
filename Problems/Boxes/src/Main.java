import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];

        for (int i = 0; i < 3; i++) {
            firstBox[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            secondBox[i] = scanner.nextInt();
        }

        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        if (Arrays.equals(firstBox, secondBox)) {
            System.out.println("Box 1 = Box 2");
        } else if (compare(firstBox, secondBox)) {
            System.out.println("Box 1 > Box 2");
        } else if (compare(secondBox, firstBox)) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }

    public static boolean compare(int[] box1, int[] box2) {
        for (int i = 0; i < box1.length; i++) {
            if (box1[i] < box2[i]) {
                return false;
            }
        }
        return true;
    }
}