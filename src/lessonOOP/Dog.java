package lessonOOP;

public class Dog extends Animal {
    private String name;
    private static int count = 0;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static void getCount() {
        System.out.println("We have " + count + " dog");;
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


    public void running (Animal animal,int length) {
        if ( length <= 500) {
        System.out.println(animal +" running " + length + " meters.");
    } else {
            System.out.println(animal + " can't run more than 500 meters");
        }
    }

    public void floating (Animal animal,int length) {
        if ( length <= 10) {
            System.out.println(animal +" running " + length + " meters.");
        } else {
            System.out.println(animal + " can't floating more than 10 meters");
        }
    }
    @Override
    public String toString() {
        return "Dog {" +
                "name = " + name + "}";
    }
}
