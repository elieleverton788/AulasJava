package model;
import java.util.List;

public class AlunoDAO {
    private List <Aluno> cadastro_alunos;

    public AlunoDAO(List <Aluno> cadastrAlunos){
        this.cadastro_alunos = cadastrAlunos;
    }
    public void createAluno(Aluno aluno){
        this.cadastro_alunos.add(aluno);
    }

    public void deleteAluno(){
        
    }
}
