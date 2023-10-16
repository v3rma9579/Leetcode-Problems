import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int column = sc.nextInt();
        getMatrix(row, column);

        sc.close();

    }

    public static void getMatrix(int row, int column) {

        int[][] randomMatrix = new int[row][column];

        Random random = new Random(10);

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                randomMatrix[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Output is ");
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                System.out.print(randomMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] result = new int[row * column];

        int temp = 0;
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                result[temp++] = randomMatrix[i][j];
            }
        }
        Arrays.sort(result);

        temp = 0;
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                randomMatrix[i][j] = result[temp++];
            }
        }
        System.out.println();
        System.out.println("Sorted Matrix = ");
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix.length; j++) {
                System.out.print(randomMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
