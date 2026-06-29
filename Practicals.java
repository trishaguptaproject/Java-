package practicals;

class Student {

    String id;
    String name;

    // Default Constructor
    Student() {
        id = "000";
        name = "Unknown";
    }

    // Parameterized Constructor
    Student(String i, String n) {
        id = i;
        name = n;
    }

    // Method Overloading
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    void display(String course) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    // Static Method
    static void collegeName() {
        System.out.println("College: MVLU CS College");
    }
}

public class Practicals {

    public static void main(String[] args) {

        Student.collegeName();

        Student s1 = new Student();
        Student s2 = new Student("085", "Trisha");

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        s2.display("Computer Science");
    }
}