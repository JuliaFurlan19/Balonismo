public class Piloto {

    private String nomePiloto;
    private String cpfPiloto;
    private String registroANAC;

    public void setNomePiloto(String nomePiloto){ this.nomePiloto = nomePiloto; }
    public String getNomePiloto(){ return this.nomePiloto; }

    public void setCpfPiloto(String cpfPiloto){ this.cpfPiloto = cpfPiloto; }
    public String getCpfPiloto(){ return this.cpfPiloto; }

    public void setRegistroANAC(String registroANAC){ this.cpfPiloto = registroANAC; }
    public String getRegistroANAC(){ return this.registroANAC; }

    public void pilotarBalao(){
        System.out.println("Piloto vôou pilotando o balão!");
    }

    // Construtor padrão
    Piloto(){

    }

    // Construtor que solicita todos os dados de todos os atributos
    Piloto(String nomePiloto, String cpfPiloto, String registroANAC){
        this.nomePiloto = nomePiloto;
        this.cpfPiloto = cpfPiloto;
        this.registroANAC = registroANAC;
    }
}
