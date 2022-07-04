package lessonOOP;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("Кот мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот поел");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = " + name + ", " + " " + super.toString() + '\'' +
                '}';
    }
}
