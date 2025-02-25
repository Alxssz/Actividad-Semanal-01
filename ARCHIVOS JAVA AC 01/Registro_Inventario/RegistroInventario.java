package Registro_Inventario;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class RegistroInventario {

    public static void main(String[] args) {

        Producto producto1 = new Producto(444, "Botas", 500);
        System.out.println("PRODUCTO:");
        System.out.println("Codigo: " + producto1.getCodigo());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());

        //editar precio
        System.out.println("");
        System.out.println("INGRESAR NUEVO PRECIO");
        producto1.setPrecio(-200);
        System.out.println("Precio Actal: " + producto1.getPrecio());
    } 
}
