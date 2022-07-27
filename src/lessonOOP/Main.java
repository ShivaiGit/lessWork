package lessonOOP;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Milk", "white", 5, "Barsik");
        Dog dog = new Dog("Meat", "black", 12, "Alfred");

        Veterinarian veterinarian = new Veterinarian("Sasha");
        veterinarian.treatment (cat);
        veterinarian.treatment(dog);

    }

}
