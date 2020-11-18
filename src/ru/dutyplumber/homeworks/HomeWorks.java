//домашнее задание №3. Смоляков Андрей

package ru.dutyplumber.homeworks;

import java.util.Random;
import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args)
    {
        for (; ; ) {
            System.out.println("Cыграем в числа или слова? \n" +
                    "Введите 1 для игры в числа  и 2 для игры в слова:");
            Scanner obj = new Scanner(System.in);

            int choice = obj.nextByte();

                if (choice == 1) randomNumber();
                else if (choice == 2) guessWord();
                else System.out.println("Введите корректный номер выбора, пожалуйста");

        }
    }

    public static void randomNumber ()
    {
         /*
         1. Написать программу, которая загадывает случайное число от 0 до 9,
         и пользователю дается 3 попытки угадать это число.
         При каждой попытке компьютер должен сообщить больше ли указанное
         пользователем число чем загаданное, или меньше.
         После победы или проигрыша выводится запрос –
         «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        */
        Scanner obj = new Scanner (System.in);
        Random randomNumber = new Random();

        System.out.println("Машина загадала число от 0 до 9. \n" +
        "Попробуйте угадать стрех попыток");

        int machineNumber = randomNumber.nextInt (10);

        for ( int cycleCount=0; cycleCount<3; ++cycleCount)
        {
            System.out.println("Попытка " + (cycleCount + 1) + ":\n");
            int userNumber = obj.nextInt();

            if (machineNumber == userNumber)
            {
                System.out.println("Угадали!");
                return;
            }
            else if (machineNumber < userNumber)
            {
                System.out.println("Неверно. Ваше число больше загаданного.");
            }
            else if (machineNumber > userNumber)
            {
                System.out.println("Неверно. Ваше число меньше загаданного.");
            }

        }

        System.out.println("Загаданное число: " + machineNumber);

    }

    public static void guessWord ()
    {
        /*
        Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
         "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
          "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
        компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
        */

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Компьютер загадал одно из слов: apple, orange, lemon, banana, apricot, avocado, broccoli,\n" +
                "carrot, cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea, peanut, pear,\n" +
                "pepper, pineapple, pumpkin, potato\n" +
                "Попробуйте угадать, а компьютер будет подсказывать\n");

        Random randomNumber = new Random();
        String machineWord = words[randomNumber.nextInt(words.length)];

        Scanner obj = new Scanner(System.in);

        for (;;)
        {
            String userWord = obj.next();
            int additionalCycleCount = 0;
            if (!userWord.equals(machineWord))
            {
                // цикл перебора букв в словах
                for (int cycleCount = 0; cycleCount < machineWord.length() & cycleCount < userWord.length(); ++cycleCount)
                {
                    if (machineWord.charAt(cycleCount) == userWord.charAt(cycleCount))
                    {
                        System.out.print(machineWord.charAt(cycleCount));
                    } else System.out.print("#");
                    additionalCycleCount = ++additionalCycleCount;
                }

                //цикл дописывания ###
                for (int cycleCount = additionalCycleCount; cycleCount < (15 - machineWord.length()); ++cycleCount)
                {
                    System.out.print("#");
                }

                System.out.println("\nПопробуйте снова.\n");
            }
            else
                {
                System.out.println("Вы угадали!\n");
                return;
                }
        }
    }

}






       // System.out.println( unknownNumber );







