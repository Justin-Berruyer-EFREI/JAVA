/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author justinberruyer
 */
public class Calculator {

    public static void main(String[] args) {
        // packages
        
        // déclaration des variables
        
        int operateur;
        int operande1;
        int operande2;
        
        Scanner sc;
        int resultat;
        
        
        
        System.out.println("Please enter the operator : \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        
        sc = new Scanner(System.in);
        
        operateur = sc.nextInt();
        
        if (operateur > 5 || operateur <1){
            System.out.print("Veuillez choisir un chiffre entre 1 et 5");
            System.exit(0);
        }
        
        System.out.print("entrer une première valeur entière \n");
        
        operande1 = sc.nextInt();
        
        System.out.print("entrer une deuxième valeur entière \n");
        
        operande2 = sc.nextInt();
        
        
        if (operateur == 1) {
            resultat = operande1 + operande2 ;
        } else if (operateur == 2 ) {
            resultat = operande1 - operande2 ;
        } else if (operateur == 3) {
            resultat = operande1 * operande2 ;
        } else if (operateur == 4) {
            resultat = operande1 / operande2 ;
        }else {
            resultat = operande1 % operande2 ;
        }
        
        System.out.print("le résultat est " + resultat);
    }
}
