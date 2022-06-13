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
public class Producto {
    Scanner scanner = new Scanner(System.in);
  
    private double precio;
  
    private int codigo;

    public Producto() {
    }

    public Producto( int precio,  int codigo) {
       
        this.precio = precio;
        this.codigo = codigo;
    }

  

   
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public  void nuevoProducto(){
      
      
       System.out.println("Inserte el precio");
       precio = (scanner.nextDouble());
       scanner.nextLine();
       System.out.println("Inserte el codigo del producto");
       codigo = (scanner.nextInt());
        scanner.nextLine();
       
    
    }

   
}
