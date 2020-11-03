//домашнее задание №2. Смоляков Андрей

package ru.dutyplumber.homeworks;

import java.util.Arrays;

public class HomeWorks {
    public static void main(String[] args) {

        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */

        int[] arrayForFirstEx = {1, 1, 1, 0, 0, 0, 1, 1, 1};

        System.out.println("Задание 1. Было: " + Arrays.toString(arrayForFirstEx));

        for (int cycleCount = 0; cycleCount < arrayForFirstEx.length; ++cycleCount) {
            if (arrayForFirstEx[cycleCount] == 1) {
                arrayForFirstEx[cycleCount] = 0;
            } else arrayForFirstEx[cycleCount] = 1;
        }

        System.out.println("Задание 1. Стало: " + Arrays.toString(arrayForFirstEx));


        // 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arrayForSecondEx = new int[8];

        for (int cycleCount = 1; cycleCount < arrayForSecondEx.length; ++cycleCount) {
            arrayForSecondEx[cycleCount] = (arrayForSecondEx[cycleCount - 1]) + 3;
        }

        System.out.println("Задание 2: " + Arrays.toString(arrayForSecondEx));


        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;

        int[] arrayForThirdEx = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int cyrcleCount = 0; cyrcleCount < arrayForThirdEx.length; ++cyrcleCount) {
            if (arrayForThirdEx[cyrcleCount] < 6)
            {
                arrayForThirdEx[cyrcleCount] = arrayForThirdEx[cyrcleCount] * 2;
            }
            else ;
        }

        System.out.println("Задание 3: " + Arrays.toString(arrayForThirdEx));


        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


        int xCoordinate = 0; //длина строки
        int yCoordinate = 0; //количество строк (высота)

        int[][] arrayForFourthEx = new int[5][5];

        // заполняем диагональ единицами в одном направлении
        for (int cycleCount = 0; cycleCount < 5; ++cycleCount) {
            arrayForFourthEx[xCoordinate][yCoordinate] = 1;
            xCoordinate = xCoordinate + 1;
            yCoordinate = yCoordinate + 1;
        }
        //меняем координаты и заполняем диагональ единицами в другом направлении

        xCoordinate = 4;
        yCoordinate = 0;

        for (int cycleCount = 0; cycleCount < 5; ++cycleCount) {
            // заполняем диагональ единицами в одном направлении
            arrayForFourthEx[xCoordinate][yCoordinate] = 1;
            xCoordinate = xCoordinate - 1;
            yCoordinate = yCoordinate + 1;
        }

        // а теперь выводим для наглядности
        System.out.println("Задание 4.");
        for (int countForPrinting = 0; countForPrinting < arrayForFourthEx.length; ++countForPrinting) {
            System.out.println(Arrays.toString(arrayForFourthEx[countForPrinting]));
        }


        // 5. ** Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета)
        // ...было бы дебильно списывать в нашей истории, isn't it?

        int[] arrayForFifth = new int[]{2, 11, 3, 5, 7, 12, 45, 6, -2, 9, 14, 21, 46, -8, 0, -10};

        int FifthArrayMinimal = arrayForFifth[0]; // устанавливаем минимум равный первому значению в массиве
        int FifthArrayMaximum = arrayForFifth[0]; // также и максимум - "исходная"

        // цикл для поиска минимального значения
        for (int cycleCount = 0; cycleCount < arrayForFifth.length; ++cycleCount) {
            if (arrayForFifth[cycleCount] < FifthArrayMinimal) {
                FifthArrayMinimal = arrayForFifth[cycleCount];
            } else ;
        }

        // цикл для поиска максимального значения
        for (int cycleCount = 0; cycleCount < arrayForFifth.length; ++cycleCount) {
            if (arrayForFifth[cycleCount] > FifthArrayMaximum) {
                FifthArrayMaximum = arrayForFifth[cycleCount];
            } else ;
        }

        System.out.println("Задание 5. Минимальное значение в массиве: " + FifthArrayMinimal);
        System.out.println("Задание 5. Максимальное значение в массиве: " + FifthArrayMaximum);






        /*
         6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
         части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
         checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
         эти символы в массив не входят.
        */

        int[] arrayForSixthEx = new int[]{3, 4, 1, 1, 1, 1, 1, 1, 1}; //можно подавать произвольный - считает все!!! :)
        System.out.println( "Задание 6. " + isThereEqualParts ( arrayForSixthEx ));



        /*
         7. **** Написать метод, которому на вход подается одномерный массив
         и число n (может быть положительным, или отрицательным),
         при этом метод должен сместить все элементымассива на n позиций.
         Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        */

        int[] arrayForSeventhEx = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}; //можно подавать произвольный - сдвигает все!!! :)
        int Number_n = 2; //устанавливаем число "сдвига"
        System.out.println("Задание 7. Было: " + Arrays.toString(arrayForSeventhEx));
        System.out.println( "Задание 7. Стало: " + Arrays.toString(movedArray (arrayForSeventhEx, Number_n)));
    }



    //метод для задания 6
    public static boolean isThereEqualParts (int [] arrayForSixthEx)
    {
        // подсчитываем сумму всех элементов массива
        int allOverArraySum = 0;

        for (int cycleCount = 0; cycleCount < arrayForSixthEx.length; ++ cycleCount)
        {
            allOverArraySum = allOverArraySum + arrayForSixthEx [cycleCount];
        }

        //сумма проверяемой левой части массива
        int leftPartArraySum = 0;


         // Считаем сумму левой части массива, постепенно увеличивая ее и сравниваем с уменьшающейся оставшейся (правой)
         // частью


        for (int cycleCount = 0; cycleCount < arrayForSixthEx.length; ++ cycleCount)
        {
            leftPartArraySum = leftPartArraySum + arrayForSixthEx [cycleCount];
            if (leftPartArraySum == allOverArraySum - leftPartArraySum) { return true;}
            else ;
        }
        return false;
    }



    // метод для задания 7
    public static int [] movedArray(int[] arrayForSeventhEx, int Number_n)
    {
        int temporary = 0; // временная переменная для переноса значений

        if (Number_n > 0) // работа метода в случае положительного сдвига
        {
            for (int cycleCount = arrayForSeventhEx.length; cycleCount > 0; --cycleCount)
            {
                if (cycleCount - Number_n - 1 < 0) { temporary = 0;} //проверили, есть ли откуда брать значения (слева по ряду)
                else {temporary = arrayForSeventhEx[cycleCount - Number_n - 1];} //перенесли значение ячейки во временную переменную
                arrayForSeventhEx[cycleCount - 1] = 0 + temporary;
            }
        }
        else // работа метода в случае отрицательного сдвига
        {
            for (int cycleCount = 0; cycleCount < arrayForSeventhEx.length; ++cycleCount)
            {
                if (cycleCount + Math.abs (Number_n) > arrayForSeventhEx.length - 1) { temporary = 0;} //проверили, есть ли откуда брать значения (справа по ряду)
                else {temporary = arrayForSeventhEx[cycleCount + Math.abs(Number_n)];} //перенесли значение ячейки во временную переменную
                arrayForSeventhEx[cycleCount] = 0 + temporary;
            }
        }
      return arrayForSeventhEx;
    }
}