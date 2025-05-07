package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numPaginas;
    private String genero;
    private int paginaAtual;


    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.paginaAtual = 1;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String abrir(){
        return "o livro foi aberto.";
    }
    public String fechar(){
        return "o livro foi fechado.";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public void marcaPagina(int pagina){
        abrir();
        if(pagina > this.getNumPaginas() || pagina < 0){
            throw new IllegalArgumentException("pagina invalida");
        }
        this.paginaAtual = pagina;
    }

    public void avancarPagina(){
        if (this.paginaAtual >= this.numPaginas) {
            throw new IllegalArgumentException("Ultima pagina");
        }
        this.paginaAtual++;
    }


    public void retrocederPagina(){
        abrir();
        if(this.paginaAtual == 0){
            throw new IllegalArgumentException("Primeira pagina");
        }
        this.paginaAtual = this.paginaAtual-1;
    }
}
