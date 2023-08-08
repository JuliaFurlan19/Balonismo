public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Júlia", "836241635", "DCYH45VGJ", "11849362748", "Rua Alfredo Campos 77", "JFCFTJ67");

        Pessoa p2 = new Pessoa("6372859403");
        p2.setNomePessoa("Rafael");
        p2.setRg("GMVSVSJJ67");
        p2.setTelefoneFamiliar("11847336289");
        p2.setEndereco("Rua Campos Sales 81");
        p2.setAssinarTermo("HMVSX29");

        Balao b1 = new Balao(1, "HDKAHDIHS", "Verde", "Peão", 30.0f, 300f, 10, 50000);

        Balao b2 = new Balao(2);
        b2.setRegistroRegularidade("MGCVHGCGHCJ");
        b2.setCor("Amarelo");
        b2.setTipo("Peão");
        b2.setAltura(32.0);
        b2.setPeso(200);
        b2.setCapacidade(8);
        b2.setValorBalao(30000);

        Piloto piloto1 = new Piloto("Wesley", "6473859402", "GMVGSVGMVDAFDVXG562");

        Piloto piloto2 = new Piloto("5362758940");
        piloto2.setNomePiloto("Ricardo");
        piloto2.setRegistroANAC("HSBXBVDFHNBVDSEG3478");

        Combustivel alcool = new Combustivel("Liquido", "alcool", true, 10000, 10L, "Texaco", 10L);
        System.out.println(b1.voar(alcool));

        Combustivel querosene = new Combustivel("querosene", "Liquido");
        querosene.setInspecaoRealizada(true);
        querosene.setPreco(2000);
        querosene.setQuantidade(20L);
        querosene.setMarca("Texaco");
        querosene.setVolume(20L);
        System.out.println(b2.voar(querosene));

        System.out.println(p1.voouPasseio(b1));
        System.out.println(p2.voouPasseio(b2));

        System.out.println(piloto1.pilotarBalao(b1));
        System.out.println(piloto2.pilotarBalao(b2));

    }
}