public class Crocodile extends Animal {
    protected String colour;
    public Crocodile(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    @Override
    public String makeSound() {
        return "Crocodile Sound";
    }

    @Override
    public String move() {
        return "Swims";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
