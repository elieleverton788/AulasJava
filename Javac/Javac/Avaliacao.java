public class Avaliacao {
    private int id;
    private String titulo;
    private float valor;
    private float peso;
    private String tipo;


    public Avaliacao(int id, String titulo, float valor, float peso, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
        this.peso = peso;
        this.tipo = tipo;
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

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
