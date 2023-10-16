import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times: ");
        int input = scanner.nextInt();

        printFibbonaciSeries(input);

        scanner.close();

    }

    public static void printFibbonaciSeries(int input) {

        int firstDigit = 0;
        int lastDigit = 1;
        System.out.print(firstDigit + " "+lastDigit+ " ");
        for (int i = 0; i < input; i++) {
            int sum = firstDigit + lastDigit;
            firstDigit = lastDigit;
            lastDigit = sum;
             System.out.print(sum + " ");

        }
    }

}
