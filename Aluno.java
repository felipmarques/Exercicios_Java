package uscs;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_P1;
    private double nota_P2;
    private double nota_P3;

    List<Double> notas = new ArrayList<>();

    public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3) {
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_P1 = nota_P1;
        this.nota_P2 = nota_P2;
        this.nota_P3 = nota_P3;

        notas.add(nota_P1);
        notas.add(nota_P2);
        notas.add(nota_P3);
    }

    public void ImprimeAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Matrícula: " + codmat);
        System.out.println("CPF: " + cpf);
        System.out.println("Nota P1: " + nota_P1);
        System.out.println("Nota P2: " + nota_P2);
        System.out.println("Nota P3: " + nota_P3);
    }

    public void ImprimeSexo() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
    }

    public double Media() {
  
    double primeiro_maior = notas.get(0);
    double segundo_maior = notas.get(1);

    for (int i = 0; i < notas.size(); i++) {
        double nota = notas.get(i);

        if (nota > primeiro_maior) {
            segundo_maior = primeiro_maior;
            primeiro_maior = nota;
        } else if (nota > segundo_maior && nota != primeiro_maior) {
            segundo_maior = nota;
        }
    }

    double media = (primeiro_maior + segundo_maior) / 2.0;
    System.out.println("Média das notas: " + media);
    return media;
}

    public void Situacao(){

        double media_aluno = this.Media();

        if (media_aluno >= 6.0){
            System.out.println("Aprovado");
        } 
        else{
            System.out.println("Reprovado");
        }
        
    }
}