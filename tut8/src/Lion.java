public class Lion extends Animal {
    protected String gender;

    public Lion(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public String move() {
        return "Run";
    }

    public void hunt(){
        System.out.println("King of Africa");
    }


}