public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion("Simba", 1, "male");
        Animal penguin = new Penguin("Gacek", 4, true);
        Animal crocodile = new Crocodile("Nile", 12, "green");
        ((Lion)lion).hunt();
        lion.displayInformation();
        penguin.displayInformation();
        crocodile.displayInformation();
    }
}