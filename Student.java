import java.util.Scanner;

public class Student {
    String studentName;

    Student() {
        this.studentName = "Unknown";
    }

    Student(String name) {
        this.studentName = name;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Student st2 = new Student(name);

        System.out.println("When no arguments was passed - "+st1.studentName);
        System.out.println("When user input was passed - "+st2.studentName);

        scanner.close();
    }
}
