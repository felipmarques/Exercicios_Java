/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author felipe.lima6_uscsonl
 */
public class Peixe extends Animal {
    private String caracteristica;
    
    public Peixe (String nome, float comprimento, int numero_patas, String cor, String ambiente, float velocidade_media, String caracteristica){
        super(nome, comprimento, numero_patas, cor, ambiente, velocidade_media);
        this.caracteristica = caracteristica;
    }
    
    public void set_caracteristica(String carac){
        this.caracteristica = carac;
    }
    
    public String get_caracteristica(){
        return this.caracteristica;
    }
    
    public void dados_peixe(){
        dados();
        System.out.println("Característica:" + this.caracteristica);
    }
    
}
