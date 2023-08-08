public class Combustivel {

    private String tipo;
    private String nome;
    private boolean inspecaoRealizada;
    private double preco;
    private double quantidade;
    private String marca;
    private double volume;

    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getTipo() { return this.tipo; }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setInspecaoRealizada(boolean inspecaoRealizada) { this.inspecaoRealizada = inspecaoRealizada; }
    public boolean getInspecaoRealizada() { return this.inspecaoRealizada; }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return this.preco; }

    public void setQuantidade(double quantidade) { this.quantidade = quantidade; }
    public double getQuantidade() { return this.quantidade; }

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return this.marca; }

    public void setVolume(double volume) { this.volume = volume; }
    public double getVolume() { return this.volume; }

    // Construtor padrão
    Combustivel(){

    }

    // Construtor que solicita todos os dados de todos os atributos
    Combustivel(String tipo, String nome, boolean inspecaoRealizada, double preco, double quantidade, String marca, double volume){
        this.tipo = tipo;
        this.nome = nome;
        this.inspecaoRealizada = inspecaoRealizada;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
        this.volume = volume;
    }

    // Construtor da minha escolha
    Combustivel(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return " com o combustível " + nome;
    }
}
