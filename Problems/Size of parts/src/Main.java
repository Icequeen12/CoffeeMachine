import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int[] results = new int[4];
        int records;

        for (int i = 0; i < numberOfStudents; i++) {
            records = scanner.nextInt();
            if (records == 2) {
                results[0] = results[0] + 1;
            } else if (records == 3) {
                results[1] = results[1] + 1;
            } else if (records == 4) {
                results[2] = results[2] + 1;
            } else if(records== 5){
                results[3]=results[3]+1;
            }

        }

    }
}