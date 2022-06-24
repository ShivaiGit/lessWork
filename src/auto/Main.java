package auto;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Green";
        car1.weight = 2000;
        car1.year = 1980;

        Car car2 = new Car();
        car2.color = "Red";
        car2.weight = 1000;
        car2.year = 2019;


        car1.print();
        System.out.println();
        car2.print();
    }
}
