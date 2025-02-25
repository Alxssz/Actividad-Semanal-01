package Registro_Inventario;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;

    
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        
        if(precio < 0){
        System.out.println("Ingrese un precio positivo Inicial");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El nuevo precio no puede ser negativo");
        }

    }
    public double getPrecio() {
        return precio;
    }

}
