/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author felipe.lima6_uscsonl
 */
public class Animal {
    private String nome;
    private float comprimento;
    private int numero_patas;
    private String cor;
    private String ambiente;
    private float velocidade_media;

    public Animal(String nome, float comprimento, int numero_patas, String cor, String ambiente, float velocidade_media){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numero_patas = numero_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade_media = velocidade_media;
    }

  public void set_nome(String nome){
      this.nome = nome;
  }  
  public void set_comprimento(float comprimento){
      this.comprimento = comprimento;
  }
  public void set_numero_patas(int numero_de_patas){
      this.numero_patas = numero_de_patas;
  }
  public void set_cor(String cor){
      this.cor = cor;
  }
  public void set_ambiente(String ambiente){
      this.ambiente = ambiente;
  }
  public void set_velocidade_media(float velocidade){
      this.velocidade_media = velocidade;
  }

  public String get_nome(){
      return this.nome;
  }
  public float get_comprimento(){
     return this.comprimento;
  }
  public int get_numero_de_patas(){
      return this.numero_patas;
  }
  public String get_cor(){
      return this.cor;
  }
  public String ambiente(){
      return this.ambiente;
  }
  public float get_velocidade_media(){
      return this.velocidade_media;
  }

  public void dados(){
          System.out.println("Nome:" + this.nome);
          System.out.println("Comprimento:" + this.comprimento);
          System.out.println("Número de patas:" + this.numero_patas);
          System.out.println("Cor:" + this.cor);
          System.out.println("Ambiente" + this.ambiente);
          System.out.println("Velocidade Média" + this.velocidade_media);
    }
}

   
