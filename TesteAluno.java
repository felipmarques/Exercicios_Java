package uscs;

public class TesteAluno{
    public static void main(String[] args) {
        Aluno X1 = new Aluno("Paulo", 55123, "800912345-12", 'M', 7.0, 6.0, 8.0);
        X1.ImprimeAluno();
        X1.Media();
        X1.Situacao();
    }
}
