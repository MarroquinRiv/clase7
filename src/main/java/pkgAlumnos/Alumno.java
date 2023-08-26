package pkgAlumnos;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String carne;
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Cursos> cursos;

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    public Alumno(String carne, String nombre, String telefono, String direccion, List<Cursos> cursos) {
        this.carne = carne;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Cursos curso) {
            this.cursos.add(curso);
    }

    public double totalPagar(){
        double total = 0;
        for (Cursos curso : this.cursos) {
            total += curso.getPrecio();
        }
        return total;
    }
}