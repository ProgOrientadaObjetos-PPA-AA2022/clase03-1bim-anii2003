/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutable04 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useLocale(Locale.US);    
        
        double valor1, valor2, valor3;
        
        valor1 = 0; valor2 = 0; valor3 = 0;
        
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        System.out.print("Ingrese el valor del presupuesto del Hospital: ");
        valor1 = leer.nextDouble();
        
        System.out.print("Ingrese el valor del presupuesto del Hospital: ");
        valor2 = leer.nextDouble();
        
        System.out.print("Ingrese el valor del presupuesto del Hospital: ");
        valor3 = leer.nextDouble();
        
        h1.establecerPresupuesto(valor1);
        h2.establecerPresupuesto(valor2);
        h3.establecerPresupuesto(valor3);
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
        System.out.printf("La suma de presupuestos es %.2f\n", suma);       
    }
}
