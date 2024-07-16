class Vehicle1 {
    String name;
    String color;

    Vehicle1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display1() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle1 {
    String model;
    int MGF_year;

    Car(String name, String color, String model, int MGF_year) {
        super(name, color);
        this.model = model;
        this.MGF_year = MGF_year;
    }

    public void display() {
        super.display1(); 
        System.out.println("Model: " + model);
        System.out.println("MGF_year: " + MGF_year);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Red", "Bolero", 2024);
        c.display();
    }
}
