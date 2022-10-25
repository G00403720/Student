package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        //First Student
        System.out.println("Please enter your student name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student2 shapeStud = new Student2();
        shapeStud.setName(name);
        System.out.println("You entered : " + shapeStud.getName());

        System.out.println("Please enter your student email");
        String email = input.nextLine();
        shapeStud.setEmail(email);
        System.out.println("You entered : " + shapeStud.getEmail());

        System.out.println("Please enter your course");
        String course = input.nextLine();
        shapeStud.setCourse(course);
        System.out.println("You entered : " + shapeStud.getCourse());

        //Second Student
        System.out.println("Please enter your student name");
        String name2 = input.nextLine();
        Student2 shapeStud2 = new Student2();
        shapeStud2.setName(name2);
        System.out.println("You entered : " + shapeStud2.getName());

        System.out.println("Please enter your student email");
        String email2 = input.nextLine();
        shapeStud2.setEmail(email2);
        System.out.println("You entered : " + shapeStud2.getEmail());

        System.out.println("Please enter your course");
        String course2 = input.nextLine();
        shapeStud2.setCourse(course2);
        System.out.println("You entered : " + shapeStud2.getCourse());

        //Third Student
        System.out.println("Please enter your student name");
        String name3 = input.nextLine();
        Student3 shapeStud3 = new Student3();
        shapeStud3.setName(name3);
        System.out.println("You entered : " + shapeStud3.getName());

        System.out.println("Please enter your student email");
        String email3 = input.nextLine();
        shapeStud3.setEmail(email3);
        System.out.println("You entered : " + shapeStud3.getEmail());

        System.out.println("Please enter your course");
        String course3 = input.nextLine();
        shapeStud3.setCourse(course3);
        System.out.println("You entered : " + shapeStud3.getCourse());
    }
}
