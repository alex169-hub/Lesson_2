package homework;

public class SumWithin {
    static final int BOTTOM_BOUND = 10;
    static final int UPPER_BOUND = 20;
    static final int BOUND = 0;

    public static void main(String[] args) {
       System.out.println("результат = " + inRange(6, 15));
       System.out.println("negaPositive = " + negaPositive(6));
       //System.out.println("" + numberStr(String txtPrint);
        System.out.println("negaPositive2 = " + negaPositive(4));
        negativeIsPositive ();
        numberStr ("папа", 3);

    }

    public static boolean inRange(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;

        if (sum >= BOTTOM_BOUND && sum <= UPPER_BOUND) {
            return true;
        } else {
            return false;
            //public static void main(String[] args) {
            //int a = 5, b = 15, c = 10, i = 20;
            //if (a + b >= c && a + b <= i) {
            // System.out.println("Верно(True)");
            //} else {
            // System.out.println("Ложь(False)");
            // }
            // }
        }
    }

    public static  void negativeIsPositive () {
        int  b = -1, a = BOUND;
        if (b >= BOUND) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
       }
    }

    public static  boolean negaPositive (int number) {
        int  num = number ;
        if (number < BOUND) {
            return true;
        } else {
            return false;
        }

    }

    public static void numberStr (String str, int number) {
        System.out.println("будем писать " + str);
        for (int a = 0; a < number; a ++) {
            System.out.println(str + " " + a);
        }
        System.out.println("закончили  ");
    }


}







