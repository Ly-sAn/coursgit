package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Veuillez saisir votre nom : " );
        String nomUtilisateur = scanner.nextLine();
        System.out.println("Bienvenue " + nomUtilisateur) ;
        System.out.println("");
        System.out.print( "Veuillez saisir votre age : " );
        String age = scanner.nextLine();
        int ageToInt = Integer.parseInt(age);
        System.out.println("Vous avez " + ageToInt) ;
        System.out.println("HOLA");
    }
}
