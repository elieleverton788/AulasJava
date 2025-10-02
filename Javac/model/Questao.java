package model;
public class Questao {
    private int id;
    private String titulo;
    private String Enunciado;
    private float Valor;


    public Questao() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return this.Enunciado;
    }

    public void setEnunciado(String Enunciado) {
        this.Enunciado = Enunciado;
    }

    public float getValor() {
        return this.Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

}
