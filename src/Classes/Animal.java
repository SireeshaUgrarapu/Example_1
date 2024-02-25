package Classes;

public class Animal {
    private String name;
    private String color;
    private String noOfEyes;

    public Animal(String name, String color, String noOfEyes) {
        this.name = name;
        this.color = color;
        this.noOfEyes = noOfEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNoOfEyes() {
        return noOfEyes;
    }

    public void setNoOfEyes(String noOfEyes) {
        this.noOfEyes = noOfEyes;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", noOfEyes='" + noOfEyes + '\'' +
                '}';
    }
}
