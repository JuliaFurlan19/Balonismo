public class Balao {

    public int id;
    public String registroRegularidade;
    public String cor;
    public String tipo;
    public double altura;
    public double peso;
    public int capacidade;
    public double valorBalao;

    public String voar(Combustivel gasPropano){
        return "voando com " + gasPropano;
    }
}
