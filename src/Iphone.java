

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo a página " + url + "...");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página fechada.");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.reproduzirMusica();
        iphone.pausarMusica();
        iphone.fazerChamada("123456789");
        iphone.receberChamada("987654321");
        iphone.abrirPagina("www.example.com");
        iphone.fecharPagina();
    }
}
