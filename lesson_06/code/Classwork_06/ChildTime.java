package Classwork_06;

// **Задание 3.**
//  Родители позволяют ребенку играть на компьютере 1 час.
//  Напишите программу, которая будет реагировать на полученную в школе оценку:
//1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
//2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
//3. "Посредственно.", время для игр уменьшается на 30 мин.
//4. "Плохо!", сегодня никаких игр на компьютере.
//5. "Позор семьи!", никаких игр на компьютере 2 дня.

import java.util.Scanner;

public class ChildTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What grade did you get for your lessons? (1, 2, 3, 4, 5");
        int marc = scanner.nextInt();

        int timeForGame = 60;
        // вводим переключатель
        switch (mark) {
            case 1: {

                System.out.println("Dood job!");
                timeForGame = timeForGame + 30;
                System.out.println("Time for Games: " + timeForGame);
                break;
            }

            case 2: {

                System.out.println("Dood");
                timeForGame = timeForGame;
                System.out.println("Time for Games: " + timeForGame);
                break;
            }

            case 3: {

                System.out.println("Okay ....");
                timeForGame = timeForGame - 30;
                System.out.println("Time for Games: " + timeForGame);
                break;
            }

            case 4: {

                System.out.println("Very bad!");
                timeForGame = timeForGame = 0;
                System.out.println("No game today!!! " + timeForGame);
                break;
            }

            case 5: {

                System.out.println("Shane on you");
                timeForGame = timeForGame - 120;
                System.out.println("Two days no Games: " + timeForGame);
                break;
            }

            default: {
                System.out.println("Wrong input");
            }

        }


    } // end of main


} // end of class
