package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w moim świetnym programi do obliczeń");
        System.out.println("Podaj N:");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj MIN:");
        int MIN = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj MAX:");
        int MAX = Integer.parseInt(scanner.nextLine()) * 10;
        System.out.println("wynik randomizacji:" + (ThreadLocalRandom.current().nextInt(MIN, MAX)));
    }
}