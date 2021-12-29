package com.company;

public class Main {

    public static void main(String[] args) {
        //solution1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //solution2
        int dateFirstFridayInMonth = 4;
        int daysInMonthAmount = 31;
        while (dateFirstFridayInMonth <= daysInMonthAmount) {
            System.out.println("Сегодня пятница, " + dateFirstFridayInMonth + "-е число. Необходимо подготовить отчет");
            dateFirstFridayInMonth += 7;
        }

        //solution3
        int yearComet;
        int yearCurrent = 2021;
        int previousYear = yearCurrent - 200;
        int nextYear = yearCurrent + 100;
        for (yearComet = 0; yearComet < nextYear; yearComet += 79) {
            if (yearComet > previousYear) {
                System.out.println(yearComet + " - год, в который можно наблюдать комету");
            }
        }
    }
}
