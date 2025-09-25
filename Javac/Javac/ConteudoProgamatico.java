public class ConteudoProgamatico {
    private int id;
    private String Titulo;
    private int ch;
    private String Recursos_Didaticos;


    public ConteudoProgamatico(int id, String Titulo, int ch, String Recursos_Didaticos) {
        this.id = id;
        this.Titulo = Titulo;
        this.ch = ch;
        this.Recursos_Didaticos = Recursos_Didaticos;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getCh() {
        return this.ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getRecursos_Didaticos() {
        return this.Recursos_Didaticos;
    }

    public void setRecursos_Didaticos(String Recursos_Didaticos) {
        this.Recursos_Didaticos = Recursos_Didaticos;
    }

}
