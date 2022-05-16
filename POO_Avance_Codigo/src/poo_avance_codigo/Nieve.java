/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avance_codigo;

/**
 *
 * @author luisa
 */
public class Nieve extends Producto {
    private String sabor;

    public Nieve() {
        super();
    }

    public Nieve(String sabor, String nombre, int precio, String cantidad, int codigo) {
        super(nombre, precio, cantidad, codigo);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    

  

    
  

  
}
