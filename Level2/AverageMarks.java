import java.util.Scanner;

class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks 1: ");
        int m1 = input.nextInt();

        System.out.print("Enter marks 2: ");
        int m2 = input.nextInt();

        System.out.print("Enter marks 3: ");
        int m3 = input.nextInt();

        double average = (m1 + m2 + m3) / 3.0;  // type conversion

        System.out.println("Average Marks = " + average);
    }
}