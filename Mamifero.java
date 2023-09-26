package Animal;

public class Mamifero extends Animal{
    private String alimento;

    public class Mamifero(String nome, float comprimento, int numero_patas, String cor, String ambiente, float velocidade_media, String alimento){
        super(nome, comprimento, numero_patas, cor, ambiente, velocidade_media)
        this.alimento = alimento;
    }

    public void set_alimento(String alimento_us){
        this.alimento = alimento_us;
    }
    public String get_alimento(){
        return this.alimento;
    }
    public void dadosMamifero(){
        super.dados();
        System.out.println("Alimento" + this.alimento);
    }
    
}
