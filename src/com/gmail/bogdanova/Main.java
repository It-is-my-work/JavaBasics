package com.gmail.bogdanova;

public class Main {

    public static void main(String[] args) {
        /*__________________________________________________________________________________
        Написать код, использующий большинство или все виды операторов, о которых сегодня говорилось.

        arithmetic operators  |   assignment operators    |    logical operators
        --       line 61      |                           |    | (||)              line 134
        ++       line 145     |   =           line 30     |    & (&&)              line 121
        /        line 151     |   /=          line 159    |    !                   line 149
        %        line 76      |   %=          line 164    |    conditional statements
        *        line 61      |   *=          line 146    |    if                  line 58
        -        line 71      |   -=          line 150    |    switch              line 92
        +        line 71      |   +=          line 85     |    ternary operator    line 76
        comparison operators
        !=                      line 121
        ==                      line 81
        >                       line 110
        <                       line 84
        <=                      line 58
        >=                      line 109
        method instanceof       line 134
        method equals           line 122
        ___________________________________________________________________________________ */

        //Показать примеры операций над разными типами данных (int + long, например).
        int aInt = 34;
        short aShort = 23;
        long aLong = aInt * aShort;
        byte aByte = (byte) (aInt + aShort);
        double aDouble = aLong * 0.23F;
        String line = "1234" + 234;

        //Добиться переполнения в min и max сторону и посмотреть что произойдет.
        aInt = Integer.MIN_VALUE - 10;
        System.out.println("переполнения int в min сторону " + aInt);
        aInt = Integer.MAX_VALUE + 10;
        System.out.println("переполнения int в max сторону " + aInt);

        // Написать код, использующий большинство или все виды операторов, о которых сегодня говорилось.
        System.out.println("Факториал 14: " + getFactorial(14));
        System.out.println("8е число Фибоначчи: " + getFibonacciValue(8));
        System.out.println("НОД 9 и 12: " + getGcd(9, 12));
        System.out.println("Среднее арифметическое (5, 9, 11): " + getArithmeticAverage(new int[]{5, 9, 11}));
        switchExample(TimesOfDay.MORNING);
        comparisonOfNumbers(78, 9);
        stringComparison("123", "123");
        System.out.println(concatenated(98));
        System.out.println("5 в степени -2: " + exponentiation(5, -2));
        System.out.println("Целочисленное деление 11/5: " + euclideanDivision(11, 5));
        System.out.println("Остаток от деления 11/5: " + findRemainder(11, 5));
    }

    //Just for an example of using operators
    static long getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(--f);
        }
    }

    static int getFibonacciValue(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }

    static int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

    static double getArithmeticAverage(int[] arrayOfNumbers) {
        double sumOfNumbers = 0;
        if (arrayOfNumbers.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                sumOfNumbers += arrayOfNumbers[i];
            }
            return sumOfNumbers / arrayOfNumbers.length;
        }
    }

    static void switchExample(TimesOfDay timesOfDay) {
        switch (timesOfDay) {
            case MORNING:
                System.out.println("Get up");
                break;
            case AFTERNOON:
                System.out.println("Work");
                break;
            case EVENING:
                System.out.println("Go home");
                break;
            case NIGHT:
                System.out.println("You can get some sleep");
                break;
        }
    }

    static void comparisonOfNumbers(int a, int b) {
        if (a >= b) {
            if (a > b) {
                System.out.println(a + " > " + b);
            } else {
                System.out.println(a + " = " + b);
            }
        } else {
            System.out.println(a + " < " + b);
        }
    }

    static void stringComparison(String a, String b) {
        if ((a != null) && (b != null)) {
            if (a.equals(b)) {
                System.out.println("These are the same strings");
            } else {
                System.out.println("These are different strings");
            }
        } else {
            System.out.println("One of the strings is null");
        }
    }

    static String concatenated(Object someObject) {
        String result = "String + ";
        if ((someObject instanceof String) || (someObject instanceof Double) || (someObject instanceof Float)
                || (someObject instanceof Long) || (someObject instanceof Integer) || (someObject instanceof Short)
                || (someObject instanceof Byte) || (someObject instanceof Boolean) || (someObject instanceof Character)) {
            return result + someObject;
        }
        return "I can but don't want do this";
    }

    static double exponentiation(int base, int exponent) {
        double result = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            if (!(exponent == 0)) {
                for (int i = 0; i > exponent; i -= 1) {
                    result *= 1.0 / base;
                }
            }
        }
        return result;
    }

    static int euclideanDivision(int a, int b) {
        a /= b;
        return a;
    }

    static int findRemainder(int a, int b) {
        a %= b;
        return a;
    }
}
