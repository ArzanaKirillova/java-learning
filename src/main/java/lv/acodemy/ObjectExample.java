package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {
        // Encapsulation (Getters, Setters)
        // Inheritance - наследование
        // Polymorphism
        // Abstraction

        Car audi = new Car("Blue", "RS6");
        audi.start();
        System.out.println(audi);

       // Audi.color = "Blue";
        // Audi.model = "RS6";
        audi.setColor("Blue");
        audi.setModel("Blue");
        System.out.println(audi);

        // Create BMW object
        // Start your BMW
        // Set color and model
        // Print object

        Car bmw = new Car();
        bmw.start();
        bmw.setColor("Black");
        bmw.setModel("X7");
        System.out.println(bmw);

        // Print text: My car is X7, and color Black
        System.out.println(String.format("My car model is %s, and color is %s", bmw.getModel(), bmw.getColor()));

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();


    }
}

