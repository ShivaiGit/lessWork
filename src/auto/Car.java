package auto;

public class Car {
    String color;
    double weight;
    int year;
    private double velocity;

    public void beep () {
        System.out.println("BEEP-BEEP!!!");
    }

    public void acceleration (double a) {
        velocity = velocity + a;
    }

    public void deceleration (double b) {
        if (velocity - b >=0)
            velocity = velocity - b;
    }

    public void print () {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + velocity);
    }
}
