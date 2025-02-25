package Promedio_Curso;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class PromedioEstudiantes {

    public static void main(String[] args) {
        
        Curso curso = new Curso(4); 

        curso.agregarEstudiante(new Estudiante("Eddy", "2029", -10));
        curso.agregarEstudiante(new Estudiante("Alexis", "2030", 69));
        curso.agregarEstudiante(new Estudiante("Natanael", "2031", 76));

        System.out.println("Promedio del curso: " + curso.calcularPromedio());
        System.out.println("");
        curso.mostrarAprobados();
        System.out.println("");
        curso.mostrarReprobados();
    
    }
}