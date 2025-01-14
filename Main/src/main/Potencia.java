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
        int total = 1;
        for(int i = 0; i < exponente; i++){
            total = base *base;
        }    
        return total;
    }
}
