/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_avance_codigo;

/**
 *
 * @author luisa
 */
public class Bebidas extends Producto{
    private String marca;
    private String sabor;

    public Bebidas() {
        super();
    }

   

    public Bebidas(String marca, String sabor, int precio, int codigo) {
        super( precio, codigo);
        this.marca = marca;
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void nuevaBebida(){
         System.out.println("Inserte el sabor");
       sabor = (scanner.nextLine());
       System.out.println("Inserte la marca");
       marca = (scanner.nextLine());
       
    }

   

   
    
    
    
}
