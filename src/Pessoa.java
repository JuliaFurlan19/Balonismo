public class Pessoa {

    private String nomePessoa;
    private String cpfPessoa;
    private String rg;
    private String telefoneFamiliar;
    private String endereco;
    private String assinarTermo;

    public void setNomePessoa(String nomePessoa) { this.nomePessoa = nomePessoa; }
    public String getNomePessoa() { return this.nomePessoa; }

    public void setCpfPessoa(String cpfPessoa) { this.cpfPessoa = cpfPessoa; }
    public String getCpfPessoa() { return this.cpfPessoa; }

    public void setRg(String rg) { this.rg = rg; }
    public String getRg() { return this.rg; }

    public void setTelefoneFamiliar(String telefoneFamiliar) { this.telefoneFamiliar = telefoneFamiliar; }
    public String getTelefoneFamiliar() { return this.telefoneFamiliar; }

    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getEndereco() { return this.endereco; }

    public void setAssinarTermo(String assinarTermo) { this.assinarTermo = assinarTermo; }
    public String getAssinarTermo() { return this.assinarTermo; }

    public String voouPasseio(Balao balao){
        return "Pessoa voou em um passeio no balão" + balao;
    }

    // Construtor padrão
    Pessoa(){

    }

    // Construtor que solicita todos os dados de todos os atributos
    Pessoa(String nomePessoa, String cpfPessoa, String rg, String telefoneFamiliar, String endereco, String assinarTermo) {
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.rg = rg;
        this.telefoneFamiliar = telefoneFamiliar;
        this.endereco = endereco;
        this.assinarTermo = assinarTermo;
    }

    // Construtor da minha escolha
    Pessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

}
