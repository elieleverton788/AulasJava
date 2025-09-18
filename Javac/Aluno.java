public class Aluno extends Usuario {
private String matricula;
private int ano_de_conclusao;
private Escola escola;

public Aluno(String nome, String cpf, int idade, String email_pessoal, String matricula, int ano_de_conclusao){
    super(nome, cpf, idade, email_pessoal);
    this.ano_de_conclusao = ano_de_conclusao;
    this.matricula = matricula;
}

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAno_de_conclusao() {
        return this.ano_de_conclusao;
    }

    public void setAno_de_conclusao(int ano_de_conclusao) {
        this.ano_de_conclusao = ano_de_conclusao;
    }


}
