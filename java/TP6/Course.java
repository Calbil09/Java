import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    
    static Scanner input = new Scanner(System.in);
    private ArrayList<classcourse> courses = new ArrayList<>();
    public void run() {
        while (true) {
            System.out.println("1. List all courses");
            System.out.println("2. Find courses by name");
            System.out.println("3. Add new course");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            if (choice==1) {
                // List all courses
                for (classcourse course : courses) {
                    System.out.println(course.getName() );
                }
            } else if (choice ==2) {
                // Find courses by name
                System.out.print("Enter the course name: ");
                String name = input.nextLine();
                ArrayList<classcourse> findCourses = new ArrayList<>();
                for (classcourse course : courses) {
                    if (course.getName().equals(name)) {
                        findCourses.add(course);
                    }
                }
                if (findCourses.isEmpty()) {
                    System.out.println("No courses found.");
                } else {
                    for (classcourse course : findCourses) {
                        System.out.println(course.getName());
                    }
                }
            } else if (choice==3) {
                // Add new course
                System.out.print("Enter the course name: ");
                String name = input.nextLine();
                input.nextLine();
                courses.add(new classcourse(name));
                System.out.println("Course added.");
            } else if (choice == 4) {
                // Quit
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        input.close();
    }
    public static void main(String[] args) {
        Course courseMenu = new Course();
        courseMenu.run();
    }
}

