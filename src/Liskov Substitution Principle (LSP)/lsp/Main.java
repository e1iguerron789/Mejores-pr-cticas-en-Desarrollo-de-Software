package lsp;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        fish.makeSound();

        Walkable walkingDog = new Dog();
        walkingDog.walk();
    }
}
