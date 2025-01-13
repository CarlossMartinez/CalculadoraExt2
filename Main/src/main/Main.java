/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author carke
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Potencia potencia = new Potencia();
        Division division = new Division();
        int a = 3;
        int b = 2;
        System.out.println(potencia.CalculaPotencia(a, b));
        System.out.println(division.dividir(a,b));
    }
    
}
