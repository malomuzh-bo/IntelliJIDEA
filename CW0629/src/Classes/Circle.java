package Classes;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculate() {
        return (float) Math.PI * radius * radius;
    }
}
