package ru.dutyplumber.homeworks;

import java.util.Scanner;//подключаю ввод с консоли
import java.text.DecimalFormat;//подключаю форматирование чисел (О ГУГЛ, любовь моя!...)

public class HomeWork_001
{
    public static void main(String[] args) //создаю (прописываю) метод main
    {
        //не определяю сразу, а объявляю, а затем инициализирую пременные

        byte $byte;
        $byte = -128;

        short $short;
        $short = -32000;

        int $int;
        $int = -2000000000;

        long $long;
        $long = 1;

        float $float;
        $float = 1.5f;

        double $double;
        $double = 1.5;

        char $char1;
        $char1 ='\u0047';
        char $char2;
        $char2 = '\u0042';

        boolean $boolean;
        $boolean = true;


        //меню пользователя и опрос
        for (;;) //открываем бесконечный цикл опроса пунктов меню
        {
            System.out.println ("\n\nДомашнее задание №1. Смоляков Андрей. \n" +
                    "Пожалуйста, выберите один из пунков задания, кроме пунктов 1 и 2 \n" +
                    "Наберите 0 для завершения\n" +
                    "1. Прописываем main. Само собой. :) \n" +
                    "2. Объявляем и инициализируем переменные. Как дважды два... \n" +
                    "3. Метод a*(b+(c/d)) \n" +
                    "4. Метод <<Два Числа>>\n" +
                    "5. Метод <<На какой стороне ты, мастер Йода?>>\n" +
                    "6. Метод <<Ниже нуля>>\n" +
                    "7. Метод <<Привет!>>\n" +
                    "8. Метод <<Високосный Год>>\n" +
                    "0. Завершение");
            Scanner in = new Scanner(System.in);
            System.out.println("Наберите номер пункта здесь: ");
            int choice = in.nextInt();

            //пользователь выбирает 3
            if (choice == 3) {
                cls();
                System.out.println("Введите число a\n");
                float am3 = in.nextFloat(); //имя переменной а и приписка m3 (метод 3) и т.д.
                System.out.println("Введите число b\n");
                float bm3 = in.nextFloat();
                System.out.println("Введите число c\n");
                float cm3 = in.nextFloat();
                System.out.println("Введите число d\n");
                float dm3 = in.nextFloat();
                cls();
                System.out.println ("Результат работы метода 3 при а=" + am3 + ", b=" + bm3 +", c=" + cm3 + " и d="
                        + dm3 +"\n");

                //ограничиваю число четырьмя знаками после запятой или ничем вместо нуля
                DecimalFormat decimalFormat = new DecimalFormat("#.##################");
                String withoutnull = decimalFormat.format(method3(am3,bm3,cm3,dm3));
                System.out.println((withoutnull));

                BackToMenu();

            }
            //пользователь выбирает 4
            else if (choice == 4)
            {
                System.out.println ("Введите первое число\n");
                int am4 = in.nextInt();
                int bm4 = in.nextInt();
                cls();
                System.out.println("Метод проверяет, лежит ли сумма введенных чисел\n" +
                        "в пределах между 10 и 20 включительно.\n" +
                        "Результат работы метода: " + method4(am4,bm4) + ",т.к. результат подсчета " + (am4
                        +bm4));
                BackToMenu();
            }

            //пользователь выбирает 5
            else if (choice == 5)
            {
                System.out.println("Введите целое число\n");
                int am5 = in.nextInt();
                cls();
                method5(am5);
                BackToMenu();
            }

            //пользователь выбирает 6
            else if (choice == 6)
            {
                System.out.println("Введите целое число\n");
                int am6 = in.nextInt();
                cls();
                System.out.println("Результат работы метода 6: " + method6(am6));
                BackToMenu();
            }

            //пользователь выбирает 7
            else if (choice == 7)
            {
                cls();
                System.out.println("Введите имя, пожалуйста:\n");

                Scanner textscan = new Scanner(System.in);
                String am7 = textscan.nextLine();
                method7(am7);
                BackToMenu();
            }

            //пользователь выбирает 8
            else if (choice == 8)
            {
                System.out.println("Введите год:\n");
                int am8 = in.nextInt();
                cls();

                if (method8(am8))
                {
                    System.out.println("Этот год високосный");
                } else {
                    System.out.println("Этот год не високосный.\nНу, самый обычный.");
                }

                BackToMenu();
            }


            //пользователь выбирает 0 - выход
            else if (choice == 0)
            {
                System.out.println("Спасибо, УЧИТЕЛЬ!!!"); //неприкрытый подхалимаж
                break;
            }
            //пользователь выбирает номер пункта за пределами перечисленных в меню
            else {
                System.out.println("Введите корректный номер пункта, пожалуйста\n");
                BackToMenu();
            }
        }

    }

    //метод 3 a*(b+(c/d))
    static float method3 (float am3,float bm3, float cm3, float dm3)
    {

        return am3*(bm3+(cm3/dm3));
    }

    //метод 4 Два числа
    static boolean method4 (int am4, int bm4)
    {
        if (10 <= am4+bm4 && 20>= am4+bm4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //метод 5 Сторона Силы
    static void method5 (int am5)
    {
        System.out.println("Метод проверяет, является ли введенное число положительным или отрицательным\n");
        if (am5>=0)
        {
            System.out.println("Ваше число положительное");
        }
        else
        {
            System.out.println("Ваше число отрицательное");
        }
    }

    //метод 6 Ниже нуля
    static boolean method6 (int am6)
    {
        System.out.println("Метод возвращает true, если введенное число отрицательное\n");
        if (am6<0) //среда предлагает упростить if, но я пока этого не делаю. Учусь. :)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Метод 7 Привет!
    static void method7 (String am7)
    {
        System.out.println ("Привет, " + am7 + ", как дела?");
    }

    //метод 8 Високосный год
    static boolean method8 (int am8)
    {
        if (am8 % 100 == 0)
        {
            if (am8 % 400 == 0) { return true;}
            else {return false;}
        }

        else
        {
            if (am8 % 4 == 0) {return true;}
            else {return false;}

        }
    }

    //метод Очистка экрана консоли
    static void cls()
    {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    //метод Ожидание действия для повторной инициализации меню
    static void BackToMenu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println ("\nВведите любое число для возврата в меню");
        int dummy = in.nextInt();
    }

}




