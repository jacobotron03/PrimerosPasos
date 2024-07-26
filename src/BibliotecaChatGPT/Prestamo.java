package BibliotecaChatGPT;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private String fechaPrestamo;

    public Prestamo(Libro libro, Miembro miembro, String fechaPrestamo) {
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "libro=" + libro + ", miembro=" + miembro + ", fechaPrestamo='" + fechaPrestamo + '\'' + '}';
    }
}

