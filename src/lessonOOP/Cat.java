package lessonOOP;

public class Cat extends Animal {
    private String name;
    static int count = 0;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static void getCount() {
        System.out.println("We have " + count + " cat");;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleep");
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = " + name + "}";
    }
}
