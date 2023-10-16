import java.util.Arrays;
import java.util.Scanner;

public class KarpekarConstant {
    public static void main(String[] args) {

        int karpekarConstant = 6174;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int number = scanner.nextInt();

        int count = 0;

        while (number != karpekarConstant) {

            number = getKarpakerConstant(number);
            System.out.println(number);
            count++;
        }
        System.out.print("No. of counts: " + count);
        scanner.close();
    }

    public static int getKarpakerConstant(int num) {

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            int lastDigit = num % 10;
            num /= 10;
            arr[i] = lastDigit;
        }

        Arrays.sort(arr);

        int asc = 0;
        int desc = 0;

        for (int i = 0; i < arr.length; i++) {
            asc = asc * 10 + arr[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            desc = desc * 10 + arr[i];
        }

        return (desc - asc);
    }
}
