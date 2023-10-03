import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your student's first name: ");
        String firstName = scan.nextLine();
        System.out.print("Please enter your student's last name: ");
        String lastName = scan.nextLine();
        System.out.print("Please enter your student's graduation year: ");
        int gradYear = scan.nextInt();
        scan.nextLine();
        Student myStudent = new Student(firstName, lastName, gradYear);

        System.out.println();
        System.out.println("Please pick one of the following to do:");
        System.out.println("1. Update graduation year\n2. Add test score\n3. View test average\n4. View highest test score\n5. View all student info\n6. Exit");
        System.out.println();
        int choice = scan.nextInt();
        System.out.println();

        while (choice != 6) {
            if (choice == 1) {
                System.out.print("What is the student's new graduation year?: ");
                myStudent.setGradYear(scan.nextInt());
            } else if (choice == 2) {
                System.out.print("What is the score that you would like to add?: ");
                myStudent.addTestScore(scan.nextDouble());
            } else if (choice == 3) {
                System.out.println("Your student's average is " + myStudent.averageTestScore());
            } else if (choice == 4) {
                System.out.println("Your student's highest test score is " + myStudent.getHighestTestScore());
            } else if (choice == 5) {
                myStudent.printStudentInfo();
            } else {
                System.out.print("That is not an option, please enter a whole number between 1 and 6 ");
                choice = scan.nextInt();
                continue;
            }
            System.out.print("What would you like to do next? ");
            choice = scan.nextInt();
        }
        System.out.println("Have a good day!");
    }
}