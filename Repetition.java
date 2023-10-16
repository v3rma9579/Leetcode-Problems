public class Repetition {
    public static void main(String[] args) {

        int x = 53321525;

        getMaxOcuurence(x, 5);

    }

    public static void getMaxOcuurence(int num, int target) {

        int lastDigit = 0;
        int count = 0;

        while (num > 0) {
            lastDigit = num % 10;
            num /= 10;
            if (lastDigit == target) {
                count++;
            }
        }
        System.out.print(count);
    }
}