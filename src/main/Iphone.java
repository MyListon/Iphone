package main;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Simula o estado da música
    private boolean musicaReproduzida = false;

    // Simula a página aberta
    private String paginaAtual = null;

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void reproduzirMusica() {
        if (!musicaReproduzida) {
            musicaReproduzida = true;
            System.out.println("Reproduzindo música...");
        } else {
            System.out.println("A música já está sendo reproduzida.");
        }
    }

    @Override
    public void pausarMusica() {
        if (musicaReproduzida) {
            musicaReproduzida = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Nenhuma música está sendo reproduzida para pausar.");
        }
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        if (paginaAtual == null) {
            paginaAtual = url;
            System.out.println("Abrindo a página " + url + "...");
        } else {
            System.out.println("Já existe uma página aberta. Feche a página atual antes de abrir outra.");
        }
    }

    @Override
    public void fecharPagina() {
        if (paginaAtual != null) {
            System.out.println("Página " + paginaAtual + " fechada.");
            paginaAtual = null;
        } else {
            System.out.println("Nenhuma página está aberta para fechar.");
        }
    }

    public static void main(String[] args) {
        // Cria uma instância da classe Iphone
        Iphone iphone = new Iphone();

        // Testa a reprodução de música
        iphone.reproduzirMusica();
        iphone.pausarMusica();
        iphone.pausarMusica(); // Testando pausar quando não há música sendo reproduzida

        // Testa funcionalidades de telefone
        iphone.fazerChamada("123456789");
        iphone.receberChamada("987654321");

        // Testa navegação na internet
        iphone.abrirPagina("www.example.com");
        iphone.abrirPagina("www.another-example.com"); // Tentando abrir outra página sem fechar a atual
        iphone.fecharPagina();
        iphone.fecharPagina(); // Tentando fechar uma página quando nenhuma está aberta
    }
}
