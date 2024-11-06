package lab3;

import java.util.Scanner;

//Superclass: Animal
class Animal {
 // Method to be overridden by subclasses
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass: Dog
class Dog extends Animal {
 // Override makeSound() method for Dog
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass: Cat
class Cat extends Animal {
 // Override makeSound() method for Cat
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class to demonstrate method overriding
public class Sound {
 public static void main(String[] args) {
     // Create a scanner object for user input
     Scanner sc = new Scanner(System.in);

     // Prompt the user to choose an animal
     System.out.println("Which animal sound would you like to hear? (1 for Dog, 2 for Cat): ");
     int choice = sc.nextInt();

     // Create a reference of the Animal class
     Animal animal;

     // Based on user choice, create either a Dog or Cat object
     if (choice == 1) {
         animal = new Dog(); // Refers to Dog object
     } else if (choice == 2) {
         animal = new Cat(); // Refers to Cat object
     } else {
         System.out.println("Invalid choice, creating a generic animal.");
         animal = new Animal(); // Refers to generic Animal object
     }

     // Call the makeSound() method, which will be overridden based on the object type
     animal.makeSound();

     // Close the scanner
     sc.close();
 }
}

