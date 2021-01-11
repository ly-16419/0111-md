package Polymorphic.Shapes;

public class Test {
    public static void main(String[] args) {
        Shape shape=new Triangle(2,6);
        System.out.println(shape.calcArea());
    }
}
