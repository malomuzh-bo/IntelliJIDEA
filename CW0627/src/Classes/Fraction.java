package Classes;

public class Fraction {
    public int numerator;
    public int denominator;
    public Fraction(){}
    public Fraction(int numer, int denom){
        numerator = numer;
        denominator = denom;
    }
    public void show(){
        /*System.out.println(numerator);
        System.out.println("-");
        System.out.println(denominator);*/
        System.out.println(numerator + "/" + denominator);
    }
    public Fraction multiply(Fraction frac){
        Fraction fr = new Fraction(numerator * frac.numerator, denominator * frac.denominator);
        return fr;
    }
    public Fraction plus(Fraction frac){
        int newNumerator = numerator * frac.denominator + frac.numerator * denominator;
        int newDenominator = frac.denominator * denominator;
        Fraction fr = new Fraction(newNumerator, newDenominator);
        return fr;
    }
    public Fraction minus(Fraction frac){
        int newNumerator = numerator * frac.denominator - frac.numerator * denominator;
        int newDenominator = frac.denominator * denominator;
        Fraction fr = new Fraction(newNumerator, newDenominator);
        return fr;
    }
    public Fraction divide(Fraction frac){
        int newNumerator = numerator * frac.denominator;
        int newDenominator = frac.numerator * denominator;
        Fraction fr = new Fraction(newNumerator, newDenominator);
        return fr;
    }

}
