package service;

import model.Student;

import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);

    public Student info() {
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter mark");
        double mark = scanner.nextDouble();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        return new Student(name, surname, mark, age);
    }


}




