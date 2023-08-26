package pkgAlumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CursosAsignados extends ArrayList<Cursos> {
    private List<Cursos> cursos;

    public CursosAsignados() {
        super ();
        this.cursos = new ArrayList<>();
    }

    @Override
    public boolean add(Cursos curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains (Object o){
        return this.cursos.stream().anyMatch((curso) -> (curso == null ? o == null : curso.equals(o)));
    }

    @Override
    public Iterator<Cursos> iterator() {
        return this.cursos.iterator();
    }

    @Override
    public int size(){
        return this.cursos.size();
    }

    @Override
    public Cursos get(int index){
        return this.cursos.get(index);
    }
}
