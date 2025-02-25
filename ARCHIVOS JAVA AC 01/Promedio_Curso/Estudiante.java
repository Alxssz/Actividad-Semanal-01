package Promedio_Curso;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Estudiante {
    
    private String nombre ;
    private String carnet ;
    private double notaFinal;
    
    
    //construcyor
     public Estudiante(String nombre, String carnet, double notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.notaFinal= notaFinal;
        
        if (notaFinal < 0){
            System.out.println("Se ingreso una nota menor a 0");}
    }

     
   
    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    
    public boolean aprobo() {
        return notaFinal>= 61;
    }

       public boolean reprobo() {
        return notaFinal < 61;
    }
}