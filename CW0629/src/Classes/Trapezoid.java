package Classes;

public class Trapezoid extends Shape {
    private float base1;
    private float base2;
    private float height;

    public Trapezoid(float base1, float base2, float height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public float calculate() {
        return 0.5f * (base1 + base2) * height;
    }
}
