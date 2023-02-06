import model.Student;
import service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service=new Service();
        Scanner scanner = new Scanner(System.in);
        Student[] students=new Student[10];
        Student student=new Student();
        int i=0;

        boolean on = true;
        while (on) {
            System.out.println("**********Menu**********");
            System.out.println("1.New Student");
            System.out.println("2. Max age Student");
            System.out.println("3.Max mark of student");
            System.out.println("4.Print all students");
            System.out.println("5.Exit");
            switch (scanner.nextInt()) {
                case 1:
               students[i]= service.info();
               i++;
                    break;

                case 2:
                    student.maxAgeStudent(students  );
                    break;
                case 3:
                    student.maxMark(students);
                    break;
                case 4:
                    student.printAll(students);
                    break;
                case 5:
                    on = false;
                    break;
                default:
                    System.out.println("Wrong impute!!!");
            }


        }
    }
}