package Promedio_Curso;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Curso {
    
    private Estudiante[] estudiantes;
    private int indice;

    
    // constructo estudiatne
    public Curso(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        indice = 0;
    }

    
    public void agregarEstudiante(Estudiante estudiante) {
        if (indice < estudiantes.length) {
            estudiantes[indice] = estudiante;
            indice++;
        } else {
            System.out.println("Curso lleno");
        }
    }

    
    public double calcularPromedio() {
        if (indice == 0) 
        return 0;

        double suma = 0;
        for (int i = 0; i < indice; i++) {
            suma = suma + estudiantes[i].getNotaFinal();
        }
        return suma / indice;
    }

    

    public void mostrarAprobados() {
        System.out.println("Estudiantes aprobados:");
        for (int i = 0; i < indice; i++) {
            if (estudiantes[i].aprobo()) {
                System.out.println(estudiantes[i].getNombre() + " - carnet: " + estudiantes[i].getCarnet()+ 
                " con nota: " + estudiantes[i].getNotaFinal());
            }
        }
    }
    
    
        public void mostrarReprobados() {
        System.out.println("Estudiantes reprobados:");
        for (int i = 0; i < indice; i++) {
            if (estudiantes[i].reprobo()) {
                System.out.println(estudiantes[i].getNombre() + " - carnet: " + estudiantes[i].getCarnet()
                + " con nota: " + estudiantes[i].getNotaFinal());
            }
        }
    }
    
}
