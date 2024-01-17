package Assignment4;

import java.util.Scanner;

class Course {
    String Name;
    String CourseID;
    String Course;

    static int pythoncount = 1;
    static int javacount = 1;
    static int cppcount = 1;

    String assignCourse() {
        if (this.Course.equals("Python")) {
            this.CourseID = "Python" + pythoncount;
            pythoncount++;
        } else if (this.Course.equals("Java")) {
            this.CourseID = "Java" + javacount;
            javacount++;
        } else if (this.Course.equals("C++") || this.Course.equals("CPP")) {
            this.CourseID = "CPP" + cppcount;
            cppcount++;
        }
        return this.CourseID;
    }
}

public class Courseregistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = input.nextInt();

        Course[] student = new Course[n];

        for (int i = 0; i < n; i++) {
            student[i] = new Course();
            System.out.println("Enter the name of the student: ");
            student[i].Name = input.next();
            System.out.println("Enter the course of the student: ");
            student[i].Course = input.next();
            student[i].CourseID = student[i].assignCourse();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + student[i].Name);
            System.out.println("Course: " + student[i].Course);
            System.out.println("Course ID: " + student[i].CourseID);
        }

        input.close();
    }
}
