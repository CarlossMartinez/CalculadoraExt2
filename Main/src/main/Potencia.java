/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author carke
 */
public class Potencia {

    public int CalculaPotencia(int base, int exponente){
        int total = base;
        for (int i = 0; i<exponente;i++){
        total = total*base;
        }
        return total;

    }
}
