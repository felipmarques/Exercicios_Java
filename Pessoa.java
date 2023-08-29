/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.poo;

/**
 *
 * @author felipe.lima6_uscsonl
 */

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


