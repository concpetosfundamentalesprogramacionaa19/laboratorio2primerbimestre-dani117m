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
        String mensaje ; 
        String nombre;
        String comparacion ;
        boolean inicio = true;
        int num_h = 0;
        double sueldo= 0 ;
        int cont = 0;
        double psj = 0;
        double psjT = 0;
        double bar = 0;
        double barT = 0;
        double sld = 0; 
        double sldT = 0; 
        int cont2 = 1;
        double total = 0;
        String salida; 
        // un mensaje que solo se mostrara una vez y no se repetira 
        mensaje = "Reporte de Gastos";
        while(inicio){// el primer ciclo para almacenar los primero datos
             // Ingresamos los primeros datos como nombres y apellido 
            System.out.println("Ingrese su Nombre y apellido");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su sueldo semanal");
            sueldo = entrada.nextInt();
            System.out.println("Ingrese el numero de hijos");
            num_h = entrada.nextInt();
            
             mensaje = String.format("%s\n \n\n Nombre y apellido:\n" 
                    +  "%s\n Sueldo Semanal: %.2f\n numero de hijos: %d\n\n" 
                    +  "\n Reporte de gastos \n Persona \tPasajes \t Bar \t\t\n" 
                    +  "Salidas ", mensaje, nombre, sueldo, 
                                           num_h);
            // empezamos el segundo ciclo aqui con la variable num_h 
            while(cont2 <=num_h ){// el ciclo termina cuando el contador sea igual a num_h 

                System.out.printf("Ingrese los gastado en Pasajes hijo %d\n" 
                        ,cont2);
                psj = entrada.nextFloat();
                System.out.printf("Ingrese los gastos en el Bar hijo %d\n",
                        cont2);
                bar = entrada.nextFloat();   
                System.out.printf("Ingrese los gastos de la Salida hijo %d\n"
                        ,cont2);
                sld = entrada.nextFloat();  
                cont2++;// contador se suma para igualar al numero de hijos  
                mensaje = String.format("%s\n hijo %d\t\t $%.2f\t $%.2f\t\t $\n" 
                        + " %.2f\n ", mensaje, cont2, psj, bar, sld); 
                // operaciones de suma total
                psjT = psjT + psj;
                barT = barT + bar;
                sldT = sldT + sld;    
        }
        total= psjT + barT + sldT; 
        if (sueldo < total){// comparacion del sueldo para saber si da o no para los gastos 
            comparacion = "falta";
        }else{
            comparacion = "alcanza";
        }
 
        mensaje = String.format("\n%s Total \t $%.2f\t $%.2f\t $%.2f" 
                    +  "\n%s El padre de familia Padre ,su sueldo"
                    +  "semanal es de $%.2f su sueldo %s\n\n" 
                    +   mensaje, psjT, barT, sldT, nombre,sueldo, 
                    comparacion);
        cont++;
        // salida de bucle 
        System.out.printf("\n Digite (no) desea continuar, digite (si) si desea "
                + "salir");
        salida= entrada.nextLine();
        if (salida.equals("si")){
            inicio= false;
        }
        // presentacion final 
        System.out.printf(mensaje);
        }
    }    
}    
