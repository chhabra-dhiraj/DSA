package io.github.chhabra_dhiraj.DSA_Basic_Structures;

public class OOPS {

    enum Week {
        Monday(0), TUESDAY(1);

        public final int index;

        Week(int i) {
            index = i;
        }
    }

    static int a = 1;

    static {
        a = a * 50;
    }

    public static void main(String[] args) {
//        Student a = new Student("abc"), b = new Student("cba");

//        System.out.println(a + " " + b);
//
//        swap(a, b);
//        System.out.println("Swap");
//
//        System.out.println(a + " " + b);
//        System.out.println("Hi Main!");
//        callMain();

//        Student student = SinStudent.getInstance();
//        SinStudent sinStudent = new SinStudent("Dhiraj");
//
//        System.out.println(student.b);
//        System.out.println(sinStudent.b);
//
//        Child ch = new Child(1, 2);

//        Week week = Week.Monday;
//        System.out.println(week.index);

        Faculty faculty = new Faculty();
    }

    private static void swap(Faculty a, Faculty b) {
        Faculty temp = a;
        a = b;
        b = temp;
    }

    private static void callMain() {
        main(new String[]{"Hello", ""});
    }
}

//class Student {
//
//    String a;
//    String b = "Vaishali";
//
//    private static Faculty instance;
//
//    public Student(String a) {
//        this.a = a;
//    }
//
//    public static Faculty getInstance() {
//        if (instance == null) {
//            instance = new Faculty("Dhiraj");
//        }
//
//        return instance;
//    }
//}

//class SinStudent extends Faculty {
//
//    String b = "Sunita";
//
//    public SinStudent(String a) {
//        super(a);
//    }
//
//}

abstract class Parent implements Dhiraj {

    int a = 5;

    public void career() {

    }
}

interface Dhiraj {

    void noRel();
}

class Child extends Parent {

    public Child() {

    }

    public Child(int a, int b) {

    }

    @Override
    public void noRel() {

    }
}

class Person {
//
    public Person() {
        System.out.println("Person is called");

    }
//
//    public Person(int a) {
//        System.out.println("Person is called, a: " + a);
//    }
}

class Faculty extends Person {

    public Faculty() {
        this(3);
        System.out.println("Faculty is called");
    }

    public Faculty(int b) {
        System.out.println("Faculty is called, b: " + b);
    }
}
