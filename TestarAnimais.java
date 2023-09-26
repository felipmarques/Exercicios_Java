package animal;

public class TestarAnimais {

    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, null);
        Peixe tubarao = new Peixe("Tubarão", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        Mamifero urso = new Mamifero("Urso-do-Canadá", 180.0f, 4, "Vermelho", "Terra", 0.5f, "Mel");    
        camelo.dadosMamifero();
        tubarao.dados_peixe();
        urso.dadosMamifero();
    }
}
