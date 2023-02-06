package model;

public class Student {
    private String name;
    private String surname;
    private double mark;
    private int age;

    public Student(String name, String surname, double mark, int age) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
        this.age = age;
    }


    public Student() {

    }

    public void printInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student surname: " + surname);
        System.out.println("Student mark :" + mark);
        System.out.println("Student age :" + age);
    }

    public void maxAgeStudent(Student[] students) {
        Student maxAge = students[0];
        Student[] maxAgeMor = new Student[10];

        for (int i = 1, j = 0; i < students.length; i++) {
            if (students[i] != null) {

                if (students[i].age > maxAge.age) {
                    maxAge = students[i];
                } else if (students[i].age == maxAge.age) {
                    maxAgeMor[j] = students[i];
                    j++;
                }
            }
        }

        for (int i = 0; i < maxAgeMor.length; i++) {
            if (maxAgeMor[i] != null) {
                maxAgeMor[i].printInfo();
            }


        }

        maxAge.printInfo();

        for (Student m : maxAgeMor) {
            if (m != null) {
                m.printInfo();

            }
        }

    }

    public void maxMark(Student[] students) {
        Student maxMark = students[0];
        Student[] morMaxMark = new Student[10];
        for (int i = 1, j = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (maxMark.mark < students[i].mark)
                    maxMark = students[i];
            } else if ((students[i] != null) && maxMark.mark == students[i].mark) {
                morMaxMark[j] = students[i];
                j++;

            }
        }
        maxMark.printInfo();

        for (int i = 0; i < morMaxMark.length; i++) {
            if (morMaxMark[i] != null) {
                morMaxMark[i].printInfo();
            }

        }
    }

    public void printAll(Student[] students) {
        Student temp = null;
        for (int i = 1; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i - 1].age > students[i].age) {
                    temp =students[i];
                    students[i]=students[i-1];
                    students[i-1]=temp;
                }
            }

        }
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null){
                students[i].printInfo();
            }

        }

    }

}


