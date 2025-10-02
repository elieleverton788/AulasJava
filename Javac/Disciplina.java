import java.util.List;
public class Disciplina {
    private String Nome_da_disciplina;
    private int Ch_total;
    private int Ch_semanal;
    private String tipo;
    private List<Professor> professores;
    private List<ConteudoProgamatico> Conteudo;


    public Disciplina(String Nome_da_disciplina, int Ch_total, int Ch_semanal, String tipo, List<Professor> professores, List<ConteudoProgamatico> Conteudo) {
        this.Nome_da_disciplina = Nome_da_disciplina;
        this.Ch_total = Ch_total;
        this.Ch_semanal = Ch_semanal;
        this.tipo = tipo;
        this.professores = professores;
        this.Conteudo = Conteudo;
    }


    public List<ConteudoProgamatico> getConteudo() {
        return this.Conteudo;
    }

    public void setConteudo(List<ConteudoProgamatico> Conteudo) {
        this.Conteudo = Conteudo;
    }


    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }


    public String getNome_da_disciplina() {
        return this.Nome_da_disciplina;
    }

    public void setNome_da_disciplina(String Nome_da_disciplina) {
        this.Nome_da_disciplina = Nome_da_disciplina;
    }

    public int getCh_total() {
        return this.Ch_total;
    }

    public void setCh_total(int Ch_total) {
        this.Ch_total = Ch_total;
    }

    public int getCh_semanal() {
        return this.Ch_semanal;
    }

    public void setCh_semanal(int Ch_semanal) {
        this.Ch_semanal = Ch_semanal;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
