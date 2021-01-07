package Main;

import java.time.Year;
import java.util.Scanner;

public class Student {
    private String firstName; //encapsulation
    private String lastName;
    private int year;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        //constructor
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1. 1st Year\n2. 2nd Year\n3. 3rd Year\n4. 4th Year\nEnter student's year: ");
        this.year = in.nextInt();

        setStudentId();
    }

    //Generate an ID
    private void setStudentId() {
        //constructor
        //grade lv + ID
        id++;
        this.studentID = year + "" + id; //it makes an id with the first character student's year
    }

    //Enroll in courses
    public void enroll() {
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll or 0 to quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("0")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while(1 != 0);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }

    //Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nStudent's Year:" + year + "\nStudent Id:" + studentID +
                "\nCourses Enrolled:" + courses + " " + "\nBalance: " + tuitionBalance;
    }
}
