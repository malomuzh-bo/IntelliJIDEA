package Classes;

public class AreaCalculator {
    private static int calculationCount = 0;

    public static float triangleArea(float base, float height) {
        calculationCount++;
        return 0.5f * base * height;
    }

    public static float triangleArea(float sideA, float sideB, float sideC) {
        calculationCount++;
        float s = (sideA + sideB + sideC) / 2;
        return (float)Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public static float rectangleArea(float length, float width) {
        calculationCount++;
        return length * width;
    }

    public static float squareArea(float side) {
        calculationCount++;
        return side * side;
    }

    public static float rhombusArea(float diagonal1, float diagonal2) {
        calculationCount++; // Increment the calculation count
        return 0.5f * diagonal1 * diagonal2;
    }

    public static int getCalculationCount() {
        return calculationCount;
    }
}
