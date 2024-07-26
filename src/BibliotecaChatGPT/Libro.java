package BibliotecaChatGPT;

public class Libro {
    private String titulo;
    private String autor;
    private boolean estaPrestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estaPrestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return estaPrestado;
    }

    public void prestar() {
        estaPrestado = true;
    }

    public void devolver() {
        estaPrestado = false;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", estaPrestado=" + estaPrestado + '}';
    }
}

