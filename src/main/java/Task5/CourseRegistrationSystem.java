package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    private String code;
    private int capacity;
    private List<String> enrolledStudents;

    public Course(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean registerStudent(String studentID) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(studentID);
            return true;
        } else {
            System.out.println("Registration failed. The course is full.");
            return false;
        }
    }

    public void removeStudent(String studentID) {
        enrolledStudents.remove(studentID);
    }
}

class Student {
    private String studentID;
    private List<String> enrolledCourses;

    public Student(String studentID) {
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(String courseCode) {
        enrolledCourses.add(courseCode);
    }

    public void dropCourse(String courseCode) {
        enrolledCourses.remove(courseCode);
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        courses.add(new Course("C101", 30));
        courses.add(new Course("C102", 25));
        courses.add(new Course("C103", 20));

        int choice;
        do {
            System.out.println("\nCourse Registration System");
            System.out.println("1. Register Student for a Course");
            System.out.println("2. Remove Student from a Course");
            System.out.println("3. Display Course Enrollments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerStudentForCourse(students, courses, scanner);
                    break;
                case 2:
                    removeStudentFromCourse(students, courses, scanner);
                    break;
                case 3:
                    displayCourseEnrollments(courses);
                    break;
                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void registerStudentForCourse(List<Student> students, List<Course> courses, Scanner scanner) {
        System.out.print("Enter student ID: ");
        String studentID = scanner.next();
        Student student = findStudentById(students, studentID);
        if (student == null) {
            student = new Student(studentID);
            students.add(student);
        }

        System.out.print("Enter course code: ");
        String courseCode = scanner.next();
        Course course = findCourseByCode(courses, courseCode);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        if (course.registerStudent(studentID)) {
            student.enrollInCourse(courseCode);
            System.out.println("Student successfully registered for the course.");
        }
    }

    private static void removeStudentFromCourse(List<Student> students, List<Course> courses, Scanner scanner) {
        System.out.print("Enter student ID: ");
        String studentID = scanner.next();
        Student student = findStudentById(students, studentID);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter course code: ");
        String courseCode = scanner.next();
        Course course = findCourseByCode(courses, courseCode);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        course.removeStudent(studentID);
        student.dropCourse(courseCode);
        System.out.println("Student removed from the course.");
    }

    private static void displayCourseEnrollments(List<Course> courses) {
        System.out.println("\nCourse Enrollments:");
        for (Course course : courses) {
            System.out.println("\nCourse Code: " + course.getCode());
            System.out.println("Enrolled Students: " + course.getEnrolledStudents().size());
        }
    }

    private static Student findStudentById(List<Student> students, String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    private static Course findCourseByCode(List<Course> courses, String courseCode) {
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
}
