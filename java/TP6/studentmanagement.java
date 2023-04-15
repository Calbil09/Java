import java.util.ArrayList;
import java.util.Scanner;
public class studentmanagement {
    static Scanner input = new Scanner(System.in);
    private ArrayList<classStudent> students;
    public studentmanagement() {
        students = new ArrayList<>();
    }
    public void addStudent() {
        System.out.print("Enter student ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        System.out.print("Enter student year: ");
        int year = input.nextInt();
        input.nextLine();
        classStudent student = new classStudent(id, name, year);
        students.add(student);
        System.out.println("Student added: " + student);
    }
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
        } else {
            for (classStudent student : students) {
                System.out.println("List Student : "+student);
            }
        }
    }
    public void removeStudent() {
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        boolean removed = false;
        for (int i = 0; i < students.size(); i++) {
            classStudent student = students.get(i);
            if (student.getName().equals(name)) {
                students.remove(i);
                removed = true;
                System.out.println("Student removed: " + student);
                break;
            }
        }
        if (!removed) {
            System.out.println("Student not found");
        }
    }
    public void updateStudent() {
        System.out.print("Enter student ID: ");
        int id = input.nextInt();
        input.nextLine(); 
        boolean updated = false;
        for (classStudent student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new student name: ");
                String name = input.nextLine();
                System.out.print("Enter new student year: ");
                int year = input.nextInt();
                input.nextLine(); 
                student.setName(name);
                student.setYear(year);
                updated = true;
                System.out.println("Student updated: " + student);
                break;
            }
        }
        if (!updated) {
            System.out.println("Student not found");
        }
    }
    public void start() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Menu:");
            System.out.println("1. Add new student");
            System.out.println("2. List students");
            System.out.println("3. Remove student by name");
            System.out.println("4. Update student information by id");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Quitting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        studentmanagement stdm = new studentmanagement();
        stdm.start();
    }
}
