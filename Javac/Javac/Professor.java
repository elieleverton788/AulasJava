import java.util.List;
public class Professor extends Usuario {
    private String Area_de_formacao;
    private int siape;
    private String nivel_de_instrucao;
    private List<Disciplina> disciplina;


    public Professor(String Area_de_formacao, int siape, String nivel_de_instrucao, List<Disciplina> disciplina) {
        super(nivel_de_instrucao, Area_de_formacao, siape, nivel_de_instrucao);
        this.Area_de_formacao = Area_de_formacao;
        this.siape = siape;
        this.nivel_de_instrucao = nivel_de_instrucao;
        this.disciplina = disciplina;
    }


    public List<Disciplina> getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }


    public String getArea_de_formacao() {
        return this.Area_de_formacao;
    }

    public void setArea_de_formacao(String Area_de_formacao) {
        this.Area_de_formacao = Area_de_formacao;
    }

    public int getSiape() {
        return this.siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getNivel_de_instrucao() {
        return this.nivel_de_instrucao;
    }

    public void setNivel_de_instrucao(String nivel_de_instrucao) {
        this.nivel_de_instrucao = nivel_de_instrucao;
    }



}
