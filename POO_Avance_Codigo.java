/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_avance_codigo;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author luisa
 */
public class POO_Avance_Codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
       
        Scanner scanner = new Scanner(System.in);
       
        try{
        do
        {
            System.out.println("Sistema");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Ver una lista de los productos");
            System.out.println("3. Realizar una transaccion");
            System.out.println("4. Fin del programa");
            
            
            System.out.println("");
            System.out.println("Porfavor seleccione una opcion del 1 al 4");
          input = (scanner.nextInt());
            if (input ==(1))
            { //Agregar un nuevo producto
                
                System.out.println("1. Agregar nieve");
                System.out.println("2. Agregar bebida");
                 input = (scanner.nextInt());
                 if(input ==(1))
                 {
                     System.out.println("Se agrego una nieve");
                 }else if (input==(2)){
                     System.out.println("Se agrego una bebida");
                 }
                     
                
                
                
                
        }
            else if (input==(2)){
                //Lista
            }
            else if (input==(3)){
                //Transaccion
            }
           
        }while(input!=(4));
    
    }catch(InputMismatchException e){
            System.out.println("El dato introducido no es valido ");
        
        }
}
}