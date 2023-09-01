package exercicio.poo;
import java.util.Scanner;

public class ExercicioPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa cliente1 = new Pessoa("Felipe", 20); 
        
        cliente1.mostra_nome();
        cliente1.mostra_idade();
        
    }
}
