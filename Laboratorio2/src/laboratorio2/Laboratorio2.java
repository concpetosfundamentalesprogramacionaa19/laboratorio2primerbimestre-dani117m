/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;
import java.util.Scanner; 
/**
 *
 * @author marce
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se ingresa el scaner 
        Scanner entrada = new Scanner(System.in);
        // Se definen variables 
        String nombres;
        String apellidos;
        int num_h = 0;
        int sueldo ;
        int cont = 1;
        int psj = 0;
        int bar = 0;
        int sld = 0; 
        // Ingresamos los primeros datos como nombres y apellido 
        System.out.println("Ingrese sus Nombres");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus Apellidos");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su sueldo semanal");
        sueldo = entrada.nextInt();
        System.out.println("Ingrese el numero de hijos");
        num_h = entrada.nextInt();
        // empezamos el ciclo aqui con la variable num_h 
        while(cont <=num_h ){// el ciclo termina cuando el contador sea igual a num_h 
            
            System.out.println("Ingrese los gastado en Pasajes");
            psj = entrada.nextInt();
            System.out.println("Ingrese los gastos en el Bar");
            bar = entrada.nextInt();   
            System.out.println("Ingrese los gastos de la Salida");
            sld = entrada.nextInt();  
            
            cont = cont+1;// contador se suma para igualar al numero de hijos  
            System.out.printf("El Señor%s%s\nPasajes%d\tBar%d\tsalidas%d\t", nombres, apellidos, psj, bar, sld);
        }
    //System.out.printf("El Señor%s%s\nPasajes%d\tBar%d\tsalidas%d\t", nombres, apellidos, psj, bar, sld);
    }
    
}
