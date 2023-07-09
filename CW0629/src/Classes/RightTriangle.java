package Classes;

public class RightTriangle extends Shape {
    private float base;
    private float height;

    public RightTriangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculate() {
        return 0.5f * base * height;
    }
}
