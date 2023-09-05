package Ex_07;

public class Livro {

    private String titulo;

    private String autor;

    private int n_paginas;

    private int isbn;

    public Livro(String titulo, String autor, int n_paginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void exibirDetalhes () {
       System.out.println( this.titulo + ", " + this.autor + ", " +this.n_paginas+ ", " + this.isbn);
    }
}
