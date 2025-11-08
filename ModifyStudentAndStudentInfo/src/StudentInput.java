

import java.util.Scanner;

public class StudentInput {
    public static void studentInput1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of courses to take: ");
        int numCourses = scanner.nextInt();

        // todo: create a new Student object, passing in numCourses
        // todo: print a message that confirms the number of courses by calling the appropriate method in the Student class

        Student student = new Student(numCourses);
        System.out.println("The number of courses this student take: " + student.getNumCourses());

        // testing: try the code with a number in range [3, 6] and a number outside that range.
        // the program should crash if you enter a number outside the range [3, 6]
    }

    public static void studentInput2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of courses to take: ");
        int numCourses = scanner.nextInt();

        try {
            Student student = new Student(numCourses);
            System.out.println("The number of courses this student take: " + student.getNumCourses());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        // todo: paste in your code from version one, and restructure it to use try-catch.
        // check the PPT for the structure
        // it is permitted to use AI to assist you with the try-catch structure if needed
        // but please try it yourself first!

        // testing: try the code with a number in range [3, 6] and a number outside that range.
        // the program should not crash if you enter a number outside that range.
        // instead, it should print a meaningful error message and close normally.
    }

    public static void main(String[] args) {
        studentInput2();
    }
}
