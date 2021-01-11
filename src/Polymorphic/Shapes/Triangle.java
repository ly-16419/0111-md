package Polymorphic.Shapes;

public class Triangle extends Shape{

    private float bottom;
    private float height;

    public Triangle(float bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public float calcArea() {
        return (bottom*height)/2;
    }
}
