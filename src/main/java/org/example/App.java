package org.example;


public class App {
    public static void main(String[] args) {
        // Пример оператора if
        int a = 5;
        if (a > 5) {
            System.out.println("a больше 5");
        }

        // Пример оператора IF-ELSE
        int b = 10;
        System.out.println("b больще 5");


        // пример оператора switch
        int c = 5;
        switch (c) {
            case 1:
                System.out.println("c равно 1");
                break;
            case 2:
                System.out.println("c равно 2");
                break;
            default:
                System.out.println("c равно 1 или 2");
        }
        int d = 10;
        String result = (d > 5) ? "d больше 5" : "d больше или равно 5";
        System.out.println(result);


        // пример
        int i;
        for (i = 0; i < 10; i++) ;
        System.out.println(i);

        // пример while
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;

            // пример цикра do while
            int k = 0;
            do {
                System.out.println(k);
                k++;
            } while (k < 10);
        }

        // блочные операторы
        int x = 10;
        {
            //область видимости блока
            int y = 20;
            System.out.println(x); // выведет 10
            System.out.println(y); // выведет 20
        }

        System.out.println(x);  // выведет


    }
}