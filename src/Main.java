public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nomePessoa = "Henrique";
        p1.cpfPessoa = "87348623236";
        p1.endereco = "Rua Werner Goldberg 77";
        p1.rg = "84629592-x";
        p1.telefoneFamiliar = "(11)382740275";

        p2.nomePessoa = "Nayara";
        p2.cpfPessoa = "837440284";
        p2.endereco = "Itaquiti 54";
        p2.rg = "84259750205-g";
        p2.telefoneFamiliar = "(11)3672937";

        p1.assinarTermo();
        p2.assinarTermo();

        Piloto piloto = new Piloto();

        piloto.nomePiloto = "Robson";
        piloto.cpfPiloto = "7498573057";
        piloto.registroANAC = "8696HGK";

        piloto.pilotarBalao();


        Balao balao = new Balao();

        balao.identificacao = "759843G";
        balao.registroRegularidade = "4875GFDH";

        balao.voar();

        p1.voouPasseio();
        p2.voouPasseio();
    }
}