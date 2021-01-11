package Polymorphic.Animals;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();
        System.out.println(animal.dark());

        Animal animal1=new Cat();
        System.out.println(animal1.dark());
    }
}
