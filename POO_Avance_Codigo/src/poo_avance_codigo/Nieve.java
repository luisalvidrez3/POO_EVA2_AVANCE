/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avance_codigo;

import java.util.Scanner;

/**
 *
 * @author luisa
 */

public class Nieve extends Producto {
     Scanner scanner = new Scanner(System.in);
    private String sabor;

    public Nieve() {
        super();
    }

    public Nieve(String sabor , int precio, String cantidad, int codigo) {
        super( precio,codigo);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
   
   
   
    public void  nuevaNieve(){
         
         System.out.println("Inserte el sabor");
       sabor = (scanner.nextLine());
      
     
       
    }
      
       
   }
        
    

  

