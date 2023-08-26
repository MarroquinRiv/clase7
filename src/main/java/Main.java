import pkgAlumnos.Alumno;
import pkgAlumnos.Cursos;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("001", "Juan Perez", "12345678", "5 calle 8-14", null);
        Cursos cur = new Cursos("Programacion", 555, 500);
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Cursos("Derecho", 12, 1));

        Alumno alumno2 = new Alumno("002", "Maria Lopez", "12345678", "5 calle 8-14", null);
        alumno2.agregarCurso(new Cursos("Programacion", 555, 500));
        alumno2.agregarCurso(new Cursos("Matematicas", 333, 345.65));

        Alumno alumno3 = new Alumno("003", "Pedro Perez", "12345678", "5 calle 8-14", null);
        alumno3.agregarCurso(new Cursos("Derecho", 12, 1));
        alumno3.agregarCurso(new Cursos("Matematicas", 333, 345.65));

        Alumno alumno4 = new Alumno("004", "Maria Perez", "12345678", "5 calle 8-14", null);
        alumno4.agregarCurso(new Cursos("Lengua", 69, 425.10));
        alumno4.agregarCurso(new Cursos("Matematicas", 333, 345.65));

        Alumno alumno5 = new Alumno("005", "Juan Lopez", "12345678", "5 calle 8-14", null);
        alumno5.agregarCurso(new Cursos("Derecho", 12, 1));
        alumno5.agregarCurso(new Cursos("Lengua", 69, 425.10));

        //System.out.println("Nombre: " + alumno1.getNombre());
        //System.out.println("Carne: " + alumno1.getCarne());

        //iteracion
        //for (Cursos curso : alumno1.getCursos()) {
        //    System.out.println("Curso: " + curso.getNombre() + "Costo: " + curso.getPrecio());
        //}

        for (Alumno alumno : new Alumno[]{alumno1, alumno2, alumno3, alumno4, alumno5}) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Carne: " + alumno.getCarne());
            double total = 0;
            double granTotal = 0;
            for (Cursos curso : alumno.getCursos()) {
                System.out.println("Curso: " + curso.getNombre() + " Costo: " + curso.getPrecio());
                total += curso.getPrecio();
                granTotal += total;
            }
            System.out.println("Total: " + total);
            System.out.println("Gran Total: " + granTotal);
        }
    }
}

//5 alumnos con 2 cursos cada uno
//mostrar el nombre del alumno y el total a pagar por cada uno
//mostrar el total a pagar por todos los alumnos