package exercicio.poo;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostra_nome() {
        System.out.println("Nome: " + nome);
    }
    public void mostra_idade() {
        System.out.println("idade: " + idade);
    }
}
