package lessonOOP;
import java.util.*;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void treatment (Animal animal) {
        System.out.println ("The veterinarian treats " + animal);
    }



}
