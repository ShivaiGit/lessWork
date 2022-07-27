package lessonOOP;

public class Dog extends Animal {
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("Dof gav gav");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = " + name + "}";
    }
}
