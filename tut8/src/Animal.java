public abstract class Animal {
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makeSound();

    public abstract String move();

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }


}
