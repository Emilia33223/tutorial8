public class Penguin extends Animal {
    protected boolean fromAntarctica;

    public Penguin(String name, int age, boolean fromAntarctica){
        super(name, age);
        this.fromAntarctica = fromAntarctica;
    }
    @Override
    public String makeSound() {
        return "Quack";
    }

    @Override
    public String move() {
        return "Swim";
    }
    public void setFromAntarctica(){
        this.fromAntarctica = true;
    }
    public boolean getFromAntarctica(){
        return fromAntarctica;
    }


}