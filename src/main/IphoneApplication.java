package main;

public class IphoneApplication {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Testa a reprodução de música com estados variados
        System.out.println("Testando reprodução de música:");
        iphone.reproduzirMusica(); // Espera-se que inicie a reprodução
        iphone.reproduzirMusica(); // Espera-se que indique que a música já está sendo reproduzida
        iphone.pausarMusica();     // Espera-se que pause a música
        iphone.pausarMusica();     // Espera-se que indique que nenhuma música está sendo reproduzida para pausar

        // Testa funcionalidades de telefone com diferentes números
        System.out.println("\nTestando funcionalidades de telefone:");
        iphone.fazerChamada("+55 11 98765-4321");   // Número fictício com código de país
        iphone.receberChamada("(11) 1234-5678");    // Número fictício com código de área local
        iphone.fazerChamada("800-123-4567");        // Número fictício de linha gratuita
        iphone.receberChamada("911");                // Número fictício de emergência

        // Testa navegação na internet com URLs fictícias e reais
        System.out.println("\nTestando navegação na internet:");
        iphone.abrirPagina("https://www.google.com");           // URL de um site de busca popular
        iphone.abrirPagina("https://www.github.com");           // URL de um site de desenvolvimento colaborativo
        iphone.abrirPagina("https://www.example.org");          // URL de um site de exemplo
        iphone.fecharPagina();                                  // Fecha a página atual
        iphone.abrirPagina("https://www.wikipedia.org");        // Tenta abrir uma nova página após fechar a anterior
        iphone.fecharPagina();                                  // Fecha a nova página aberta
    }
}

