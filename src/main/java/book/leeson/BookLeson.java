package book.leeson;

//обявления класса BookLeson
public class BookLeson {

    //объвление метода main
    public static void main(String[] args) {
        //dataTypes(); //объвление метода dataTypes()
        //constans(); //объвление метода constans()
        //arithmetic(); // метод: Выполнение арифмтических операций
        //assignment(); // метод: Присваивание значений
        //comparison(); // метод: Сравнение величин проверка синхронизации
        //logic (); // метод: ОЦЕНОЧНАЯ ЛОГИКА
        //condition(); // метод: ПРОВЕРКА УСЛОВИЙ,УСЛОВНЫЙ ОПЕРАТОР
        //precedence(); // метод: ПРИОРИТЕТ ОПЕРАЦИЙ
        escape(); // метод: УПРАВЛЯЮЩИЕ ЛИТЕРАЛЫ

    }

    // метод
    public static void dataTypes() {
        //одиночный символ в ЮНИКОДЕ, в одинарных кавычках!
        char/*тип перемено*/letter/*название переменной*/ = 'F'/*обозначение переменной*/;

        //любое количество символов в ЮНИКОДЕ,вдвойных кавычках!
        String title = "Изучаем Java";

        // целое число в диаазоне от -2 147 483 648 до 2 147 483 647
        int namber = 52;

        // вещественное число с плавающей точкой(дробь) float всегда имеет суфикс f!
        float decimal = 67.9f;

        //логические значения true или false!
        boolean result = false;
        System.out.println("______________________________");

        // вывод:  + используется как объединение текстовых строк и значений сохраненных переменных  )
        System.out.println("Одиночный символ - " + letter);
        System.out.println("Полных лет - " + namber);
        System.out.println("Книга - " + title);
        System.out.println("Температура по фарингейту - " + decimal);
        System.out.println("Ответ - " + result);
        System.out.println("______________________________");
    }

    /* Программа демонстрирующая использование констант
     *  метод constans ()
     */
    public static void constans() {
        // константы для посчета очков
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        // объявленные переменные
        int td, pat, fg, total;

        // посчет очков
        td = 4 * TOUCHDOWN; // 4 х 6 = 24
        pat = 3 * CONVERSION; // 3 х 1 = 3
        fg = 2 * FIELDGOAL; // 2 х 3 = 6
        total = (td + pat + fg); // 24 + 3 + 6 = 33

        // вывод вычесленной суммы
        System.out.println("Очков всего: - " + total + " забито");
        System.out.println("______________________________");
    }

    //Выполнение арифмтических операций
    public static void arithmetic() {
        int num = 100;
        int factor = 20;
        int sum = 0;
        sum = num + factor; // 100 + 20
        System.out.println("Результат сложения - " + sum);

        sum = num - factor; //100 - 20
        System.out.println("Результат вычитания - " + sum);

        sum = num * factor; // 100 * 20
        System.out.println("Результат умножения - " + sum);

        sum = num / factor; // 100 / 20
        System.out.println("Результат деления - " + sum);
        System.out.println("______________________________");
    }

    // Присваивание значений
    public static void assignment() {
        String txt = "Изучаем";
        String lang = "_Java";
        txt += lang; // присваивание и объединение строк
        System.out.println("Скадываем и присваеваем строки - " + txt);
        int sum = 20;
        int num = 10;
        sum += num; // присваиваем результат  (20 + 10 = 30)
        System.out.println("Скадываем и присваеваем  целые числа - " + sum);
        int factor = 5;
        sum *= factor; // присваиваем результат  (30 х 5 = 150)
        System.out.println("Результат умножения - " + sum);
        sum /= factor; // присваиваем результат  (150 / 5 = 30)
        System.out.println("Результат деления - " + sum);
        System.out.println("______________________________");
    }

    //Сравнение величин проверка синхронизации
    public static void comparison() {
        String txt = "Фантастика";
        String lang = "Java";
        boolean state = (txt == lang); //присваиваем результат проверки
        System.out.println("Проверка строк на равенство: " + state);
        state = (txt != lang); //проверка строк на неравенство
        System.out.println("Проверка строк на равенство: " + state);
        int dozen = 12;
        int score = 20;
        state = (dozen > score); // присваеваем результат
        System.out.println("Проверка на больше: " + state);
        state = (dozen < score); // присваеваем результат
        System.out.println("Проверка на меньше: " + state);
        System.out.println("______________________________");
    }

    //ОЦЕНОЧНАЯ ЛОГИКА
    public static void logic() {
        boolean yes = true; // переменная логического типа
        boolean no = false; // переменная логического типа
        System.out.println("Результат выражения yes И yes - " + (yes && yes));
        System.out.println("Результат выражения yes И no - " + (yes && no));
        System.out.println("Результат выражения yes ИЛИ yes - " + (yes || yes));
        System.out.println("Результат выражения yes ИЛИ no - " + (yes || no));
        System.out.println("Результат выражения no ИЛИ no - " + (no || no));
        System.out.println("Первначальное значение переменной yes  - " + yes);
        System.out.println("Инвертированная переменная yes  - " + !yes);
        System.out.println("______________________________");
    }

    //ПРОВЕРКА УСЛОВИЙ,УСЛОВНЫЙ ОПЕРАТОР
    public static void condition() {
        int num1 = 1357;
        int num2 = 2468;
        String resuit;
        resuit = (num1 % 2 != 0) ? "Нечетное" : "Четное";
        System.out.println(num1 + "-" + resuit);
        resuit = (num2 % 2 != 0) ? "Нечетное" : "Четное";
        System.out.println(num2 + "-" + resuit);
        System.out.println("______________________________");
    }

    //ПРИОРИТЕТ ОПЕРАЦИЙ
    public static void precedence(){
        int sum = 32 - 8 + 16 * 2; // 16 * 2 = 32,+ 24 = 56
        System.out.println( "Порядок действий по умолчанию: "+sum);
        sum = (32 - 8 + 16) * 2;
        System.out.println( "Указанный порядок действий: "+sum);
        sum = (32 - (8 + 16)) * 2;
        System.out.println( "Специфический порядок действий: "+sum);
        System.out.println("______________________________");
    }

    // УПРАВЛЯЮЩИЕ ЛИТЕРАЛЫ
    public static void escape(){
        String header = "";
        header = "\n\tНИЖНИЙ НОВГОРОД ПРОГНОЗ НА 3 ДНЯ:\n";
        header +="\n\tДень\t\tМакс\tМин\tОсадки\n";
        header +="\t____\t\t____\t___\t__________\n";
        String forecast = "";
        forecast = "\tЧетверг\t\t06С\t\t03С\tОблачно\n";
        forecast += "\tПятница\t\t11С\t\t0С\tОблачно\n";
        forecast += "\tСуббота\t\t09С\t\t03С\tДождь\n";
        System.out.println(header + forecast);
    }
}



