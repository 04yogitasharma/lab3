package lab3;

//Superclass: HillStations
class HillStations {
 // Method to display location
 public void location() {
     System.out.println("Location of the Hill Station.");
 }

 // Method to display what it's famous for
 public void famousFor() {
     System.out.println("This Hill Station is famous for something.");
 }
}

//Subclass: Manali
class Manali extends HillStations {
 // Override location() method
 @Override
 public void location() {
     System.out.println("Manali is located in Himachal Pradesh.");
 }

 // Override famousFor() method
 @Override
 public void famousFor() {
     System.out.println("Manali is famous for its snow-capped mountains and adventure sports.");
 }
}

//Subclass: Mussoorie
class Mussoorie extends HillStations {
 // Override location() method
 @Override
 public void location() {
     System.out.println("Mussoorie is located in Uttarakhand.");
 }

 // Override famousFor() method
 @Override
 public void famousFor() {
     System.out.println("Mussoorie is famous for its scenic beauty and waterfalls.");
 }
}

//Subclass: Gulmarg
class Gulmarg extends HillStations {
 // Override location() method
 @Override
 public void location() {
     System.out.println("Gulmarg is located in Jammu and Kashmir.");
 }

 // Override famousFor() method
 @Override
 public void famousFor() {
     System.out.println("Gulmarg is famous for skiing and its winter landscapes.");
 }
}

//Main class to demonstrate the method overriding
public class Location_FamousFor {
 public static void main(String[] args) {
     // Create object of parent class, but referring to subclass objects (dynamic polymorphism)
     HillStations hillStation;

     // Refers to Manali object
     hillStation = new Manali();
     System.out.println("Calling methods for Manali:");
     hillStation.location();
     hillStation.famousFor();

     System.out.println(); // Line break for clarity

     // Refers to Mussoorie object
     hillStation = new Mussoorie();
     System.out.println("Calling methods for Mussoorie:");
     hillStation.location();
     hillStation.famousFor();

     System.out.println(); // Line break for clarity

     // Refers to Gulmarg object
     hillStation = new Gulmarg();
     System.out.println("Calling methods for Gulmarg:");
     hillStation.location();
     hillStation.famousFor();

    

 }
}

