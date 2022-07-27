package lessonOOP;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Milk", "white", 5, "Barsik");
        Dog dog = new Dog("Meat", "black", 12, "Alfred");
        Cat cat1 = new Cat("Meat", "red", 11, "Buka");

        Cat.getCount();
        Dog.getCount();
        System.out.println();

        dog.running(dog,183);
        dog.floating(dog,10);



        Veterinarian veterinarian = new Veterinarian("Sasha");

    }

}
