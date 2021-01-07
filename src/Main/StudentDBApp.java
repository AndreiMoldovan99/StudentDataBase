package Main;

import java.util.Scanner;

public class StudentDBApp {

    public static void main(String[] args) {

        //How many new students you want to add
        System.out.println("Enter the number of new students you want to add: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents]; //array of students

        //Create n number of new students
        for(int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
