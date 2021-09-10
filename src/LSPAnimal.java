class Animals {
    public void speak() {
        System.out.println(".......");
    }
}

class Horse extends Animals {
    public void speak() {
        System.out.println("Neigh");
    }
}

class Donkey extends Animals {
    public void speak() {
        System.out.println("Hee Haw");
    }
}

public class LSPAnimal {

    public static void main(String args[]) {
        Animals horse = new Horse();
        Animals donkey = new Donkey();
        horse.speak();
        donkey.speak();
    }
}