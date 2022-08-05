package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите день недели на английском с капс локом");
        
        Day day = Day.valueOf(scanner.nextLine());


        switch(day){
            case MONDAY -> System.out.println(Day.MONDAY.lesson);
            case TUESDAY -> System.out.println(Day.TUESDAY.lesson);
            case WEDNESDAY -> System.out.println(Day.WEDNESDAY.lesson);
            case THURSDAY -> System.out.println(Day.THURSDAY.lesson);
            case FRIDAY -> System.out.println(Day.FRIDAY.lesson);
            case SATURDAY -> System.out.println(Day.SATURDAY.lesson);
            case SUNDAY -> System.out.println(Day.SUNDAY.lesson);

        }

    }
}