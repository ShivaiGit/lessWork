package lessonOOP;

public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("Пёс гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Пёс ест");
    }

    @Override
    public void sleep() {
        System.out.println("Пёс спит");
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = " + name + ", " + " " + super.toString() + '\'' +
                '}';
    }
}
