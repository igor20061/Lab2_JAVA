// Главный класс с дружественным интерфейсом
public class lab2 {
    public static void main(String[] args) {
        System.out.println("=== ОБЪЕДИНЕННАЯ ПРОГРАММА ===");
        System.out.println();


        System.out.println("=== ZAD1 - РАБОТА С ТОЧКАМИ ===");
        zad1Demo();
        System.out.println();


        System.out.println("=== ZAD2 - РАБОТА С ИМЕНАМИ ===");
        zad2Demo();
        System.out.println();


        System.out.println("=== ZAD3 и ZAD4 - РАБОТА С ГОРОДАМИ ===");
        zad3zad4Demo();
        System.out.println();


        System.out.println("=== ZAD5 - РАБОТА С ДРОБЯМИ ===");
        zad5Demo();
        System.out.println();


    }

    // Демонстрация Zad1
    public static void zad1Demo() {
        Point point1 = new Point(2, 3.);
        Point point2 = new Point(7, -4);
        Point point3 = new Point(0, -1.6);

        System.out.println("Точка 1: " + point1.Coordinates());
        System.out.println("Точка 2: " + point2.Coordinates());
        System.out.println("Точка 3: " + point3.Coordinates());
    }

    // Демонстрация Zad2
    public static void zad2Demo() {

        Name name1 = new Name("Клеопатра");                          // Только имя
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");  // Фамилия, имя, отчество
        Name name3 = new Name("Маяковский", "Владимир");            // Фамилия и имя

        // Вывод на экран
        System.out.println("Имя 1: " + name1.getFullName());
        System.out.println("Имя 2: " + name2.getFullName());
        System.out.println("Имя 3: " + name3.getFullName());
    }

    // Демонстрация Zad3 и Zad4
    public static void zad3zad4Demo() {
        // Создаем города
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // Добавляем пути вручную
        A.addPath(B, 5);
        A.addPath(D, 6);
        A.addPath(F, 1);
        B.addPath(F,1);
        B.addPath(C,3);
        B.addPath(A,5);
        C.addPath(B, 3);
        C.addPath(D, 4);
        D.addPath(E,2);
        D.addPath(C,4);
        D.addPath(A,6);
        E.addPath(F,2);
        E.addPath(F,2);
        F.addPath(A,1);
        F.addPath(B,1);
        F.addPath(E,2);



        // Пример создания города с уже заданными путями
        City[] citiesForF2 = {B, E};
        int[] costsForF2 = {2,1};
        City F2 = new City("F2", citiesForF2, costsForF2);

        // Вывод информации
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

        System.out.println(F2);
    }

    // Zad5 - Работа с дробями
    public static void zad5Demo() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(2, 5);

        System.out.println("Созданные дроби:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println();

        System.out.println("Примеры операций:");

        Fraction sumResult = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sumResult);

        Fraction subtractResult = f3.subtract(f4);
        System.out.println(f3 + " - " + f4 + " = " + subtractResult);

        Fraction multiplyResult = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + multiplyResult);

        Fraction divideResult = f3.divide(f4);
        System.out.println(f3 + " / " + f4 + " = " + divideResult);

        Fraction addWithInt = f1.add(2);
        System.out.println(f1 + " + 2 = " + addWithInt);

        Fraction subtractWithInt = f3.subtract(1);
        System.out.println(f3 + " - 1 = " + subtractWithInt);

        Fraction multiplyWithInt = f2.multiply(3);
        System.out.println(f2 + " * 3 = " + multiplyWithInt);

        Fraction divideWithInt = f4.divide(2);
        System.out.println(f4 + " / 2 = " + divideWithInt);
        System.out.println();

        //Вывод в формате «1/3 * 2/3 = 2/9»
        System.out.println("Вывод в требуемом формате:");
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f3 + " - " + f4 + " = " + f3.subtract(f4));
        System.out.println(f3 + " / " + f4 + " = " + f3.divide(f4));
        System.out.println();

        // Вычисление f1.sum(f2).div(f3).minus(5)
        System.out.println("Вычисление f1.add(f2).divide(f3).subtract(5):");
        Fraction result = f1.add(f2).divide(f3).subtract(5);
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f1.add(f2) + " / " + f3 + " = " + f1.add(f2).divide(f3));
        System.out.println(f1.add(f2).divide(f3) + " - 5 = " + result);
        System.out.println("Итоговый результат: " + result);
    }
}