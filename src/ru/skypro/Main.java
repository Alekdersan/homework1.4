package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Циклы
        // задача 1

        int n = 1, j = 10;

        while (n < 11) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println('\n');// если поставить System.out.print("\n"); - будет переход на слудующую новую строку без пропуска строки

        // Задача 2

        int d = 4;
        for (; d <= 31; d += 7) {
            System.out.println("Сегодня пятница " + d + " число. Необходимо подготовить отчет.");
        }
        System.out.println('\n');

        // Задача 3

        int y = 0;
        int step = 79;// периодичность пролета/появления кометы, шаг в годах
        int year = 2022;// задать год
        int beforYear = 200;// лет до заданного года
        int afterYear = 100;// лет после заданного года
        int befor = year - beforYear;// выводить в консоль лет до заданного года
        int after = year + afterYear;// выподить в консоль лет после заданного года

        for (; y <= after; y += step) {
            if (y > befor && y < after)
                System.out.println(y + " год появления кометы.");
        }
        System.out.println('\n');


        // Задание 4
        int p = 0;
        while (p < 30) {
            p++;
            if (p % 3 != 0 && p % 5 != 0)
                System.out.println(p);
            if (p % 3 == 0 && p % 5 != 0) {
                System.out.println(p + " ping");
            }
            if (p % 5 == 0 && p % 3 != 0) {
                System.out.println(p + " pong");
            }
            if (p % 3 == 0 && p % 5 == 0) {
                System.out.println(p + " ping pong");
            }
        }
    }
}
