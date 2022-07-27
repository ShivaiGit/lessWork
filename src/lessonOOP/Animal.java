package lessonOOP;

public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void running (int length) {
        System.out.println( " running " + length + " meters.");
    }
    public void floating (Animal animal,int length) {
        System.out.println(animal + " floating " + length + " meters.");
    }


    public void getVoice() {

    }

    public void eat() {

    }

    public void sleep() {

    }

    @Override
    public String toString() {
        return "Animal {" +
                "ration = '" + ration + '\'' +
                ", color = '" + color + '\'' +
                ", weight = " + weight +
                '}';
    }

}
