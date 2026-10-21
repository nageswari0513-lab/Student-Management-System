
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Student> students =
            new ArrayList<>();

    private static final Scanner scanner =
            new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    viewStudents();
                    break;
                case "3":
                    searchStudent();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        int id;

        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number.");
            return;
        }

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter course: ");
        String course = scanner.nextLine().trim();

        if (id <= 0 || name.isEmpty() || course.isEmpty()) {
            System.out.println("Enter a positive ID, name, and course.");
            return;
        }

        students.add(new Student(id, name, course));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayDetails();
        }
    }

    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id;

        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number.");
            return;
        }

        for (Student student : students) {
            if (student.getId() == id) {
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id;

        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID must be a number.");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
