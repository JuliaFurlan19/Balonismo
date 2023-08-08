public class Balao {

    private int id;
    private String registroRegularidade;
    private String cor;
    private String tipo;
    private double altura;
    private double peso;
    private int capacidade;
    private double valorBalao;

    public void setId(int id) { this.id = id; }
    public int getId() { return this.id; }

    public void setRegistroRegularidade(String registroRegularidade) { this.registroRegularidade = registroRegularidade; }
    public String getRegistroRegularidade() { return this.registroRegularidade; }

    public void setCor(String cor) { this.cor = cor; }
    public String getCor() { return this.cor; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getTipo() { return this.tipo; }

    public void setAltura(double altura) { this.altura = altura; }
    public double getAltura() { return this.altura; }

    public void setPeso(double peso) { this.peso = peso; }
    public double getPeso() { return this.peso; }

    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
    public int getCapacidade() { return this.capacidade; }

    public void setValorBalao(double valorBalao) { this.valorBalao = valorBalao; }
    public double getValorBalao() { return this.valorBalao; }

    public String voar(Combustivel combustivel){
        return "balão voou" + combustivel;
    }

    // Construtor padrão
    Balao(){

    }

    // Construtor que solicita todos os dados de todos os atributos
    Balao(int id, String registroRegularidade, String cor, String tipo, double altura, double peso, int capacidade, double valorBalao){
        this.id = id;
        this.registroRegularidade = registroRegularidade;
        this.cor = cor;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.capacidade = capacidade;
        this.valorBalao = valorBalao;
    }

    // Construtor da minha escolha
    Balao(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "número " + id;
    }
}
