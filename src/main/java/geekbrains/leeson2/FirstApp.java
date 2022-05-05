package geekbrains.leeson2;

public class FirstApp {
    public static void main(String[] args) {
         System.out.println (summ (7,9 ));
        // printSomeText();
        // prinMyText("Java");
        // swiExampl();
        // foExampl ();
        // otrExampl ();
        // foExampl_1 ();
        // mainApp();

    }

    static int summ(int a, int b) {
        return a + b;
    }

    static void printSomeText() {
        System.out.println("Hello");
    }

    static void prinMyText(String txtToPrint) {
        System.out.println(txtToPrint);
    }

    static void swiExampl() {
        int a = 4;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a > 1");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни один из кейсов не сработал");
        }
    }

    static void foExampl() {
        for (int b = 0; b <= 2; b++) {
            System.out.println("b = " + b);
        }
        System.out.println("Конец");
    }

    static void otrExampl() {
        int x;
        for (x = 100; x >= 0; x -= 50) {
            System.out.println(x + "");
        }

    }

    static void foExampl_1() {
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 2; b++) {
                for (int c = 0; c < 2; c++) {
                    System.out.println("" + a + b + c);
                }
            }
        }
    }

    static void mainApp() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}






