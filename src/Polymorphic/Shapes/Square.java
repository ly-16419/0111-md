package Polymorphic.Shapes;

public class Square extends Shape{
    private float size;

    public Square(float size) {
        this.size = size;
    }

    @Override
    public float calcArea() {
        return (size*size);
    }
}
