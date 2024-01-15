import java.util.*;

public class main{

    Rectangle rectangle1 = new Rectangle(12,65);

    public static void main(String[] args) {


        Set<String> uniqueBookTitles = new HashSet<>();

        uniqueBookTitles.add("Harry Potter 1");
        uniqueBookTitles.add("Harry Potter 2");
        uniqueBookTitles.add("Harry Potter 3");

        //System.out.println("Library Inventory: " + uniqueBookTitles);

        uniqueBookTitles.add("Harry Potter 3");

        //System.out.println("Updated Inventory: " + uniqueBookTitles);





    }


}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mikkel Grove");

        person.displayInfo();
    }
}


class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
 }

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}


class Vehicle {
    String vehicleType;

    public Vehicle(String type) {
        this.vehicleType = type;
        System.out.println("Creating a " + vehicleType + " vehicle");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String type, int doors) {
        super(type);
        this.numberOfDoors = doors;
        System.out.println("Car with " + numberOfDoors + " doors");
    }

    void displayDetails() {
        System.out.println("Vehicle Type: " + super.vehicleType);
        System.out.println("Number of Doors: " + this.numberOfDoors);






        float num = 10.5f;
        int num2 = (int) num;


        System.out.println(num2);

    }


    }

}



public class Constant {
    public static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area of a circle with radius " + radius + ": " + area);
    }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

interface Printable {
    void print();
}
interface Scannable {
    void scan();
}

class Printer implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void scan() {
        System.out.println("Scanning");
    }
}

class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}z


class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("Hello my name is: " + name);
    }
}

class Student extends Person {
    int studentId;

    public Student(String name, int studentId){
        super(name);
        this.studentId = studentId;
    }

    void study() {
        System.out.println("Studying...");
    }
}