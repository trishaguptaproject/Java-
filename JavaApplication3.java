package javaapplication3;

// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class JavaApplication3 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal obj = new Dog();
        obj.sound();
    }
}