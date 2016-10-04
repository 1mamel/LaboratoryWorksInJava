package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w moim świetnym programi do obliczeń");
        int N = 0;
        int MIN = 0;
        int MAX = 0;
        while(true) {
            try{
                System.out.println("Podaj N:");
                N = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(Exception e) {
                System.out.println("Nie podano liczby");
            }
        }
        while(true) {
            try{
                System.out.println("Podaj MIN:");
                MIN = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(Exception e) {
                System.out.println("Nie podano liczby");
            }
        }
        while(true) {
            try{
                System.out.println("Podaj MAX:");
                MAX = Integer.parseInt(scanner.nextLine());
                if(MAX <= MIN)
                {
                    System.out.println("Max nie moze byc mniejszy badz rowny MIN:");
                    continue;
                }
                break;
            }
            catch(Exception e) {
                System.out.println("Nie podano liczby");
            }
        }
        int iloscTrafien = 0;

        for (int i = 0;i<N;i++)
        {
            int wylosowany = ThreadLocalRandom.current().nextInt(MIN, MAX*10);
            if(wylosowany <= MAX && wylosowany >= MIN)
            {
                iloscTrafien++;
            }
        }
            System.out.println("Ilosc trafionych:" + iloscTrafien);
    }
}