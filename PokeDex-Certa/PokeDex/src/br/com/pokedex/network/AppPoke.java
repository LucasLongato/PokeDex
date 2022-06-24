package br.com.pokedex.network;

import java.util.Scanner;

public class AppPoke {


    public static void letsGoPoke(){
        System.out.println("================================================================");
        System.out.println("|                          POKEDEX                              |");
        System.out.println("================================================================");
    }

    public static int userChoice(){
        Scanner scanner = new Scanner(System.in);
        int Choice  = 0;
        System.out.println("================================================================");
        System.out.println("||                        VAMOS LA                             ||");
        System.out.println("||       ESCOLHA O SEU POKEMON DESEJADO A VER AS INFORMAÇÃO    ||");
        System.out.println("================================================================");
        Choice = scanner.nextInt();

        if (I > 150 == I < 0) {
            while(I > 150 == I < 0){
                System.out.println("================================================================");
                System.out.println("||                 ESTE POKENON NAO E VALIDO                   ||");
                System.out.println("||       			   DIGITE NOVAMENTE:                       ||");
                System.out.println("================================================================");
                Choice  = scanner.nextInt();
            }

        }
        return Choice;
    }
}