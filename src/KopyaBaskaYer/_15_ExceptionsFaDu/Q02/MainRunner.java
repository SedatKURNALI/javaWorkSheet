package KopyaBaskaYer._15_ExceptionsFaDu.Q02;

import java.util.Scanner;

import static _15_ExceptionsFaDu.Q02.Student.studentsOfSchool;

public class MainRunner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        School sch = new School();
        System.out.print("School name (to be added into the list) : ");
        sch.schoolName = scan.nextLine();
        System.out.print("Student capacity of this school : ");
        sch.maxStudentNumbers = scan.nextInt();

        System.out.println("*********** STUDENT INFO REGISTRY ***********");

        for (int i = 0; i < sch.maxStudentNumbers; i++) {
            Student std = new Student();
            System.out.print(i + 1 + " . Student Name: ");
            scan.nextLine(); // dummy scan
            std.setName(scan.nextLine());
            System.out.print("Student Surname : ");
            std.setSurname(scan.nextLine());

            while (true) {
                try {
                    System.out.print("Student age : ");
                    std.age = scan.nextDouble();
                    if (std.age < 3 || std.age > 15) {
                        throw new ArithmeticException();
                    } else {
                        break;
                    }

                } catch (ArithmeticException e) {
                    System.out.println("WARNING ! : Student age should be between 3-15");

                } catch (Exception e) {
                    String str = scan.next();
                    System.out.println("WARNING ! Please enter a valid age number");

                }
            }
            Student std1= new Student(std.getName(), std.getSurname(), std.getAge());
            studentsOfSchool.add(std1);
        }


        System.out.println(studentsOfSchool.toString());


    } // end of main

}
