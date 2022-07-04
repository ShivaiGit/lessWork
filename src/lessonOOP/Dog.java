package lessonOOP;

public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("ϸ� �������");
    }

    @Override
    public void eat() {
        System.out.println("ϸ� ���");
    }

    @Override
    public void sleep() {
        System.out.println("ϸ� ����");
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = " + name + ", " + " " + super.toString() + '\'' +
                '}';
    }
}
