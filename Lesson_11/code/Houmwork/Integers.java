package Houmwork;
// Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс. Поставьте этот элемент в начало массива вместо имеющегося.

public class Integers {
    public static void main(String[] args) {

        // сначала данные массива. масив это комод с кучей ящиков. В данном случае 10
        int[] numbers = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83}; // ящики с гвоздями разной длинны

        // Куда какие положил не помню, надо найти самые длинные
        int maxNumbers = numbers[0]; // открываю первый и предполагаю что он самый длинный
        int maxIndex = 0; // Индекс первого ящика

        // Запускаем фиртуальные руки для перебора ящиков FOR
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumbers) { // мои виртуальные глаза, они смотрят и сравнивают
                maxNumbers = numbers[i]; // maxNumbers = максимальная длинна
                maxIndex = i; // ящик в котором лежат самые длинные гвозди (ИНДЕКС!!!)
            }
        }

        // Просим сообщит нам итоги
        System.out.println("Максимальный элемент: " + maxNumbers);
        System.out.println("Индекс максимального элемента: " + maxIndex);

        // Меняем местами максимальный элемент с первым элементом массива
        int temp = numbers[0]; // Сохраняем первый элемент ТЕМП - это временный
        numbers[0] = maxNumbers; // Вставляем максимальный элемент в начало
        numbers[maxIndex] = temp; // Ставим первый элемент на место максимального

        // Выводим изменённый массив
        System.out.println("Изменённый массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");

        }



    } // end of main


} // end of class
