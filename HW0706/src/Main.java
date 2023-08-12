import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;
import java.util.function.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1
        /*Predicate<Integer> task1_1 = (q)->q%4==0&&q%100!=0||q%400==0;
        System.out.println(task1_1.test(2023));

        BinaryOperator<Integer> task1_2 = (q, w)->q>w? (q-w) : w-q;
        System.out.println(task1_2.apply(17, 29));
        System.out.println(task1_2.apply(37, 29));

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 8, 12);
        Predicate<LocalDate> isSunday = date -> date.getDayOfWeek() == DayOfWeek.SUNDAY;

        long task1_3 = ChronoUnit.WEEKS.between(
                startDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)),
                endDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
        );
        System.out.println("Number of full Sundays: " + task1_3);

        LocalDate date = LocalDate.of(1969, 7, 20);
        Function<LocalDate, String> task1_4 = d -> d.getDayOfWeek().name();
        System.out.println("Day of the week: " + task1_4.apply(date));*/
        //2
//        int[] fraction1 = {3, 4};
//        int[] fraction2 = {5, 7};
//
//        BiFunction<int[], int[], int[]> plus = (frac1, frac2) -> {
//            int numer = frac1[0] * frac2[1] + frac1[1] * frac2[0];
//            int denom = frac1[1] * frac2[1];
//            return new int[]{numer, denom};
//        };
//
//        BiFunction<int[], int[], int[]> minus = (frac1, frac2) -> {
//            int numer = frac1[0] * frac2[1] - frac1[1] * frac2[0];
//            int denom = frac1[1] * frac2[1];
//            return new int[]{numer, denom};
//        };
//
//        BiFunction<int[], int[], int[]> multiply = (frac1, frac2) -> {
//            int numer = frac1[0] * frac2[0];
//            int denom = frac1[1] * frac2[1];
//            return new int[]{numer, denom};
//        };
//
//        BiFunction<int[], int[], int[]> div = (frac1, frac2) -> {
//            int numer = frac1[0] * frac2[1];
//            int denom = frac1[1] * frac2[0];
//            return new int[]{numer, denom};
//        };
//
//        int[] sum = plus.apply(fraction1, fraction2);
//        int[] diff = minus.apply(fraction1, fraction2);
//        int[] mult = multiply.apply(fraction1, fraction2);
//        int[] division = div.apply(fraction1, fraction2);
//
//        System.out.println("Sum: " + sum[0] + "/" + sum[1]);
//        System.out.println("Minus: " + diff[0] + "/" + diff[1]);
//        System.out.println("Multiply: " + mult[0] + "/" + mult[1]);
//        System.out.println("Division: " + division[0] + "/" + division[1]);
        //3
        /*BinaryOperator<Integer> maxFunc = (a, b) -> a > b ? a : b;
        BinaryOperator<Integer> minFunc = (a, b) -> a < b ? a : b;

        int num1 = 17;
        int num2 = 3;
        int num3 = -5;
        int num4 = 12;

        int max = maxFunc.apply(maxFunc.apply(num1, num2), maxFunc.apply(num3, num4));
        int min = minFunc.apply(minFunc.apply(num1, num2), minFunc.apply(num3, num4));

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);*/
        //4
        Predicate<Integer> check = num1 -> num1 == 7;
        System.out.println(check.test(11));
        System.out.println(check.test(7));
        Predicate<Integer> range = (num) -> num > 7 && num < 36;
        System.out.println(range.test(28));
        System.out.println(range.test(-5));
        Predicate<Integer> positive = number -> number > 0;
        Predicate<Integer> negative = number -> number < 0;
        int number = -10;
        System.out.println(positive.test(number));
        System.out.println(negative.test(number));
    }
}